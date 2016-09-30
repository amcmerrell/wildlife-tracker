public class EndangeredAnimal extends Animal {
  public Health health;
  public Age age;

  public static final boolean ENDANGERED = true;
  // public enum Health {
  //   HEALTHY("Healthy"), ILL("Ill"), OKAY("Okay");
  //
  //   private final String text;
  //
  //   private Health(final String text) {
  //     this.text = text;
  //   }
  //
  //   @Override
  //   public String toString() {
  //     return text;
  //   }
  // }
  public enum Age {
    NEWBORN, YOUNG, ADULT;
  }

  public EndangeredAnimal(String name, String healthString, String ageString) {
    super(name);
    this.health = Health.valueOf(healthString);
    this.age = Age.valueOf(ageString);
  }

  public String getHealth() {
    return health.toString();
  }
}
