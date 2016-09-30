import org.sql2o.*;
import java.util.List;

public class EndangeredAnimal extends Animal {
  public String health;
  public String age;

  public static final boolean ENDANGERED = true;

  public static final String HEALTHY = "Healthy";
  public static final String ILL = "Ill";
  public static final String OKAY = "Okay";

  public static final String NEWBORN = "Newborn";
  public static final String YOUNG = "Young";
  public static final String ADULT = "Adult";

  public EndangeredAnimal(String name, String health, String age) {
    super(name);
    this.health = health;
    this.age = age;
    this.endangered = ENDANGERED;
  }

  public String getHealth() {
    return health;
  }

  public String getAge() {
    return age;
  }

  public static List<EndangeredAnimal> allEndangeredAnimals() {
    String sql = "SELECT * FROM animals WHERE endangered = true";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(EndangeredAnimal.class);
    }
  }
  @Override
  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO animals (name, health, age, endangered) VALUES (:name, :health, :age, :endangered)";
      this.id = (int) con.createQuery(sql, true)
        .throwOnMappingFailure(false)
        .addParameter("name", this.name)
        .addParameter("health", this.health)
        .addParameter("age", this.age)
        .addParameter("endangered", this.endangered)
        .executeUpdate()
        .getKey();
    }
  }

  @Override
  public boolean equals(Object otherEndangeredAnimal) {
    if (!(otherEndangeredAnimal instanceof EndangeredAnimal)) {
      return false;
    } else {
      EndangeredAnimal newEndangeredAnimal = (EndangeredAnimal) otherEndangeredAnimal;
      return this.getName().equals(newEndangeredAnimal.getName()) &&
        this.getHealth().equals(newEndangeredAnimal.getHealth()) &&
        this.getAge().equals(newEndangeredAnimal.getAge()) &&
        this.isEndangered() == newEndangeredAnimal.isEndangered();
    }
  }
}
