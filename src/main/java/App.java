import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.security.InvalidParameterException;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("animals", Animal.all());
      model.put("normalAnimals", Animal.allNormal());
      model.put("endageredAnimals", EndangeredAnimal.allEndangeredAnimals());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/animals/new-endangered", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String animalName = request.queryParams("animal-name");
      String animalHealth = request.queryParams("animal-health");
      String animalAge = request.queryParams("animal-age");
      EndangeredAnimal newAnimal = new EndangeredAnimal(animalName, animalHealth, animalAge);
      try {
        newAnimal.checkFields();
        newAnimal.save();
      } catch(InvalidParameterException ipe) {
        request.session().attribute("message", ipe.getMessage());
        response.redirect("/badrequest");
      }
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/animals/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Animal animal = Animal.find(Integer.parseInt(request.params(":id")));
      if(animal.isEndangered()) {
        animal = (EndangeredAnimal) animal;
      }
      model.put("animal", animal);
      model.put("sightings", animal.getSightings());
      model.put("template", "templates/animal-instances.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
