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

  @Test
  public void all_returnsAllInstancesOfSighting_true() {
    Animal firstAnimal = new Animal("Bear");
    firstAnimal.save();
    Sighting firstSighting = new Sighting("NW Quadrant", "Ranger Rick", firstAnimal.getId());
    firstSighting.save();
    Animal secondAnimal = new Animal("Chipmunk");
    secondAnimal.save();
    Sighting secondSighting = new Sighting("S Quadrant", "Ranger Steve", secondAnimal.getId());
    secondSighting.save();
    assertTrue(Sighting.all().get(0).equals(firstSighting));
    assertTrue(Sighting.all().get(1).equals(secondSighting));
  }

  @Test
  public void save_successfullyAddsSightingToDatabase_True() {
    Animal testAnimal = new Animal("Bear");
    testAnimal.save();
    Sighting testSighting = new Sighting("NW Quadrant", "Ranger Rick", testAnimal.getId());
    testSighting.save();
    assertTrue(Sighting.all().get(0).equals(testSighting));
  }

}
