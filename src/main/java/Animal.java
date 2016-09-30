import org.sql2o.*;
import java.util.List;

public class Animal {
  public int id;
  public String name;
  //public boolean endangered;

  public static final boolean ENDANGERED = false;

  public Animal(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  public boolean isEndangered() {
    return ENDANGERED;
  }

  // public List<Animal> all() {
  //   try(Connection con = DB.sql2o.open()) {
  //     String sql = "SELECT * FROM animals;"
  //     return con.createQuery(sql).executeAndFetch(Animal.class);
  //   }
  // }

  // public void save() {
  //   try Connection
  // }

}
