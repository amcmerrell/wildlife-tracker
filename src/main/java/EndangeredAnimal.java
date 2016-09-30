public class EndangeredAnimal extends Animal {
  public String health;
  public String age;

  public static final boolean ENDANGERED = true;

  public EndangeredAnimal(String name, String health, String age) {
    super(name);
    this.health = health;
    this.age = age;
  }
}
