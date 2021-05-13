package models;

public class Student {
  private int id;
  private String name;
  private String course;
  private String date;
  private int teacherId;
  private int courseId;

  public Student(int id, String name, String course, String date, int teacherId, int courseId) {
    this.id = id;
    this.name = name;
    this.course = course;
    this.date = date;
    this.teacherId = teacherId;
    this.courseId = courseId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  @Override
  public String toString() {
    return "Estudiante{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", course='" + course + '\'' +
      ", date='" + date + '\'' +
      ", teacherId=" + teacherId +
      ", courseId=" + courseId +
    '}';
  }
}
