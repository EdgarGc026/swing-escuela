package models;

public class Student {
  private String studentDNI;
  private String name;
  private String teacher;
  private String course;
  private int score;
  private String date;

  public String getStudentDNI() {
    return studentDNI;
  }

  public void setStudentDNI(String studentDNI) {
    this.studentDNI = studentDNI;
  }

  public String getTeacher() {
    return teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Student(String studentDNI, String name, String teacher, String course, int score, String date) {
    this.studentDNI = studentDNI;
    this.name = name;
    this.teacher = teacher;
    this.course = course;
    this.score = score;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public int getScore() { return score; }
  public void setScore( int score ) { this.score = score; }

  @Override
  public String toString() {
    return "Estudiante{" +
      ", name='" + name + '\'' +
      ", course='" + course + '\'' +
    '}';
  }
}
