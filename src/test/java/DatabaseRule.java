import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {

  @Override
  protected void before() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/DATABASE_NAME_TEST", null, null);
  }

  @Override
  protected void after() {
    try(Connection con = DB.sql2o.open()) {
      String deleteCLASSQuery = "DELETE FROM table *;";
      con.createQuery(deleteCLASSQuery).executeUpdate();
    }
  }
}
