public class EndangeredAnimal extends Animal {
  public Health health;
  public Age age;

  public static final boolean ENDANGERED = true;
  public enum Health {
    HEALTHY, ILL, OKAY;
  }
  public enum Age {
    NEWBORN, YOUNG, ADULT;
  }

  public EndangeredAnimal(String name, String healthString, String ageString) {
    super(name);
    this.health = Health.valueOf(healthString);
    this.age = Age.valueOf(ageString);
  }
}
