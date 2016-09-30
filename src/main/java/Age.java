public enum Age {
  NEWBORN("Newborn"), YOUNG("Young"), ADULT("Adult");

  private final String text;

  private Age(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
