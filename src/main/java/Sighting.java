import org.sql2o.*;
import java.util.List;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sighting {
  int id;
  Timestamp dateTime;
  String location;
  String rangerName;
  int animalId;

  public Sighting(String location, String rangerName, int animalId) {
    this.location = location;
    this.rangerName = rangerName;
    this.animalId = animalId;
  }

  public int getId() {
    return id;
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

  public static List <Sighting> all() {
    String sql = "SELECT * FROM sightings";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Sighting.class);
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO sightings (dateTime, location, rangerName, animalId) VALUES (now(), :location, :rangerName, :animalId)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("location", this.location)
        .addParameter("rangerName", this.rangerName)
        .addParameter("animalId", this.animalId)
        .executeUpdate()
        .getKey();
    }
  }

  public static Sighting find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM sightings WHERE id = :id";
      return con.createQuery(sql)
        .addParameter("id", id)
        .executeAndFetchFirst(Sighting.class);
    }
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
