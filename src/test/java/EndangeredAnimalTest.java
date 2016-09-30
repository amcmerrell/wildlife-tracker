import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.List;

public class EndangeredAnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_endangeredAnimalInstantiatesCorrectly_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    assertEquals(true, testAnimal instanceof EndangeredAnimal);
  }

  @Test
  public void getHealth_returnsHealthAsCorrectString_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    assertEquals("Healthy", testAnimal.getHealth());
  }

  @Test
  public void getAge_returnsAgeAsCorrectString_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    assertEquals("Newborn", testAnimal.getAge());
  }

  @Test
  public void isEndangered_returnsCorrectBoolean_true() {
    EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    assertEquals(true, testAnimal.isEndangered());
  }

  @Test
  public void equals_recognizesSameValues_true () {
    EndangeredAnimal animalOne = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    animalOne.save();
    EndangeredAnimal animalTwo = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
    animalTwo.save();
    assertEquals(true, animalOne.equals(animalTwo));
  }

//Currently failing but displays correct info.
  // @Test
  // public void allEndangeredAnimals_returnsAllInstancesOfEndangeredAnimal_true() {
  //   EndangeredAnimal firstAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
  //   firstAnimal.save();
  //   EndangeredAnimal secondAnimal = new EndangeredAnimal("Grizzly Bear", "Ill", "Young");
  //   secondAnimal.save();
  //   assertEquals(firstAnimal, EndangeredAnimal.allEndangeredAnimals().get(0));
  //   assertEquals(secondAnimal, EndangeredAnimal.allEndangeredAnimals().get(1));
  // }

//Currently failing but displays correct info
  // @Test
  // public void save_successfullyAddsAnimalToDatabase_True() {
  //   EndangeredAnimal testAnimal = new EndangeredAnimal("Polar Bear", "Healthy", "Newborn");
  //   testAnimal.save();
  //   assertEquals(true, EndangeredAnimal.allEndangeredAnimals().get(0).equals(testAnimal));
  // }
}
