import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class AnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_animalInstantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Bear");
    assertEquals(true, newAnimal instanceof Animal);
  }

  @Test
  public void getName_getsCorrectName() {
    Animal testAnimal = new Animal("Bear");
    assertEquals("Bear", newAnimal.getName());
  }

  // @Test
  // public void all_returnsAllInstancesOfAnimal_true() {
  //   Animal firstAnimal = new Animal("Bear");
  //   firstAnimal.save();
  //   Animal secondAnimal = new Animal("Chipmunk");
  //   secondAnimal.save();
  //   assertTrue(Animal.all().get(0).equals(firstAnimal));
  //   assertTrue(Animal.all().get(1).equals(secondAnimal));
  // }
  //
  // @Test
  // public void save_successfullyAddsAnimalToDatabase_True() {
  //   Animal testAnimal = new Animal("Bear");
  //   newAnimal.save();
  //   assertTrue(Animal.all().get(0).equals(testMonster));
  // }
}
