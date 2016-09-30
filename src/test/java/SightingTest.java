import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class SightingTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_sightingInstantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Bear");
    Sighting testSighting = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    assertEquals(true, testSighting instanceof Sighting);
  }

  @Test
  public void getLocation_getsCorrectLocation_true() {
    Animal testAnimal = new Animal("Bear");
    Sighting testSighting = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    assertEquals("NW Quadrant", testSighting.getLocation());
  }

  @Test
  public void getRangerName_getsCorrectRangerName_true() {
    Animal testAnimal = new Animal("Bear");
    Sighting testSighting = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    assertEquals("Ranger Rick", testSighting.getRangerName());
  }

  @Test
  public void getAnimalId_getsCorrectAnimalId_true() {
    Animal testAnimal = new Animal("Bear");
    Sighting testSighting = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    assertEquals(testAnimal.getId(), testSighting.getAnimalId());
  }

  @Test
  public void equals_recognizesSameValues_true () {
    Animal testAnimal = new Animal("Bear");
    testAnimal.save();
    Sighting sightingOne = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    Sighting sightingTwo = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    assertEquals(true, sightingOne.equals(sightingTwo));
  }

}
