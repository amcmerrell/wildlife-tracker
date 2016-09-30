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

  @Test
  public void getAge_returnsAgeAsCorrectString_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    assertEquals("Newborn", testAnimal.getAge());
  }

  @Test
  public void isEndangered_returnsCorrectBoolean_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    assertEquals(true, testAnimal.isEndangered());
  }

  @Test
  public void equals_recognizesSameValues_true () {
    EndangeredAnimal animalOne = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    animalOne.save();
    EndangeredAnimal animalTwo = new EndangeredAnimal("Polar Bear", "HEALTHY", "NEWBORN");
    animalTwo.save();
    assertEquals(true, animalOne.equals(animalTwo));
  }
}
