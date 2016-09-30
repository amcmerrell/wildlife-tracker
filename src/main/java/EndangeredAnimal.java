public class EndangeredAnimal extends Animal {
  public Health health;
  public Age age;

  public static final boolean ENDANGERED = true;

  public EndangeredAnimal(String name, String healthString, String ageString) {
    super(name);
    this.health = Health.valueOf(healthString);
    this.age = Age.valueOf(ageString);
  }

  public String getHealth() {
    return health.toString();
  }

  public String getAge() {
    return age.toString();
  }
}
