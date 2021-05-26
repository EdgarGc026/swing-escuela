package models;

public class Student {
  private String studentDNI;
  private String name;
  private String date;
  private CourseTeacher courseteacher;

  public Student(String studentDNI, String name, String date, CourseTeacher courseteacher) {
    this.studentDNI = studentDNI;
    this.name = name;
    this.date = date;
    this.courseteacher = courseteacher;
  }

  public String getStudentDNI() {
    return studentDNI;
  }

  public void setStudentDNI(String studentDNI) {
    this.studentDNI = studentDNI;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CourseTeacher getCourseteacher() {
    return courseteacher;
  }

  public void setCourseteacher(CourseTeacher courseteacher) {
    this.courseteacher = courseteacher;
  }

  @Override
  public String toString() {
    return "Student{" +
      "studentDNI='" + studentDNI + '\'' +
      ", name='" + name + '\'' +
      ", date='" + date + '\'' +
      ", courseteacher=" + courseteacher +
    '}';
  }
}
