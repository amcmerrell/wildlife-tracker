import org.sql2o.*;
import java.util.List;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sighting {
  int id;
  Timestamp date;
  String location;
  String rangerName;
  int animalId;

  public Sighting(String location, String rangerName, int animalId) {
    this.location = location;
    this.rangerName = rangerName;
    this.animalId = animalId;
  }

  public String getLocation() {
    return location;
  }

  public String getRangerName() {
    return rangerName;
  }

  public int getAnimalId() {
    return animalId;
  }


  @Override
    public boolean equals(Object otherSighting) {
      if (!(otherSighting instanceof Sighting)) {
        return false;
      } else {
        Sighting newSighting = (Sighting) otherSighting;
        return this.getLocation().equals(newSighting.getLocation()) &&
          this.getRangerName().equals(newSighting.getRangerName()) &&
          this.getAnimalId() == newSighting.getAnimalId();
    }
  }
}
