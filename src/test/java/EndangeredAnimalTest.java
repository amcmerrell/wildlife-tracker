import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class EndangeredAnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_endangeredAnimalInstantiatesCorrectly_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    assertEquals(true, testAnimal instanceof EndangeredAnimal);
  }

  @Test
  public void getHealth_returnsHealthAsCorrectString_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    assertEquals("Healthy", testAnimal.getHealth());
  }
}