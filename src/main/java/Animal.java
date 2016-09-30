import org.sql2o.*;
import java.util.List;

public class Animal {
  public int id;
  public String name;
  public boolean endangered;

  public static final boolean ENDANGERED = false;

  public Animal(String name) {
    this.name = name;
  }

}
