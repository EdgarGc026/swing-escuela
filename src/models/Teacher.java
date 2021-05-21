package models;

public class Teacher {
  private  int personaNumber;
  private String name;
  private String course;

  public Teacher(int personaNumber, String name, String course) {
    this.personaNumber = personaNumber;
    this.name = name;
    this.course = course;
  }

  public int getPersonaNumber() {
    return personaNumber;
  }
  public void setPersonaNumber(int personaNumber) {
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
