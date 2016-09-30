import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class AnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_animalInstantiatesCorrectly_true() {
    Animal newAnimal = new Animal("Bear");
    assertEquals(true, newAnimal instanceof Animal);
  }
}
