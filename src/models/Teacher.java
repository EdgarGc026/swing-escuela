package models;

public class Teacher {
  private String personaNumber;
  private String name;
  private String course;

  public Teacher(String personaNumber, String name, String course) {
    this.personaNumber = personaNumber;
    this.name = name;
    this.course = course;
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

  public void setCourse(String course){
    this.course = course;
  }
  public String getCourse(){
    return course;
  }
}
