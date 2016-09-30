public class EndangeredAnimal extends Animal {
  public Health health;
  public Age age;

  public static final boolean ENDANGERED = true;

  public EndangeredAnimal(String name, String healthString, String ageString) {
    super(name);
    this.health = Health.valueOf(healthString);
    this.age = Age.valueOf(ageString);
    this.endangered = ENDANGERED;
  }

  public String getHealth() {
    return health.toString();
  }

  public String getAge() {
    return age.toString();
  }

  // @Override
  // public static List <EndangeredAnimal> all() {
  //   String sql = "SELECT * FROM animals WHERE endangered = true";
  //   try(Connection con = DB.sql2o.open()) {
  //     return con.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(EndangeredAnimal.class);
  //   }
  // }
  //
  // @Override
  // public void save() {
  //   try(Connection con = DB.sql2o.open()) {
  //     String sql = "INSERT INTO animals (name, health, age, endangered) VALUES (:name, :health, :age, :endangered)";
  //     this.id = (int) con.createQuery(sql, true)
  //       .throwOnMappingFailure(false)
  //       .addParameter("name", this.name)
  //       .addParameter("health", this.health)
  //       .addParameter("age", this.age)
  //       .addParameter("endangered", ENDANGERED)
  //       .executeUpdate()
  //       .getKey();
  //   }
  // }

  @Override
  public boolean equals(Object otherEndangeredAnimal) {
    if (!(otherEndangeredAnimal instanceof EndangeredAnimal)) {
      return false;
    } else {
      EndangeredAnimal newEndangeredAnimal = (EndangeredAnimal) otherEndangeredAnimal;
      return this.getName().equals(newEndangeredAnimal.getName()) &&
        this.getHealth().equals(newEndangeredAnimal.getHealth()) &&
        this.getAge().equals(newEndangeredAnimal.getAge()) &&
        this.isEndangered() == newEndangeredAnimal.isEndangered();
    }
  }
}
