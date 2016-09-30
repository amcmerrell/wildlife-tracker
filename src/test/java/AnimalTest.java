import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
//Create .equals override
public class AnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_animalInstantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Bear");
    assertEquals(true, testAnimal instanceof Animal);
  }

  @Test
  public void getName_getsCorrectName() {
    Animal testAnimal = new Animal("Bear");
    assertEquals("Bear", testAnimal.getName());
  }

  @Test
  public void isEndangered_returnsCorrectBoolean_true() {
    Animal testAnimal = new Animal("Bear");
    assertEquals(false, testAnimal.isEndangered());
  }

  @Test
  public void equals_recognizesSameValues_true () {
    Animal animalOne = new Animal("Bear");
    animalOne.save();
    Animal animalTwo = new Animal("Bear");
    animalTwo.save();
    assertEquals(true, animalOne.equals(animalTwo));
  }

  @Test
  public void all_returnsAllInstancesOfAnimal_true() {
    Animal firstAnimal = new Animal("Bear");
    firstAnimal.save();
    Animal secondAnimal = new Animal("Chipmunk");
    secondAnimal.save();
    assertTrue(Animal.all().get(0).equals(firstAnimal));
    assertTrue(Animal.all().get(1).equals(secondAnimal));
  }

  @Test
  public void save_successfullyAddsAnimalToDatabase_True() {
    Animal testAnimal = new Animal("Bear");
    testAnimal.save();
    assertTrue(Animal.all().get(0).equals(testAnimal));
  }
}
