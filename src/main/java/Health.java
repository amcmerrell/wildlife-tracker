public enum Health {
  HEALTHY("Healthy"), ILL("Ill"), OKAY("Okay");

  private final String text;

  private Health(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
