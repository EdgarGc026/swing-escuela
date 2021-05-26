package models;

public class Teacher {
  private String personaNumber;
  private String name;

  public Teacher(String personaNumber, String name) {
    this.personaNumber = personaNumber;
    this.name = name;
  }

  public String getPersonaNumber() {
    return personaNumber;
  }

  public void setPersonaNumber(String personaNumber) {
    this.personaNumber = personaNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Teacher{" +
      "personaNumber='" + personaNumber + '\'' +
      ", name='" + name + '\'' +
    '}';
  }
}
