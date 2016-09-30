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

}
