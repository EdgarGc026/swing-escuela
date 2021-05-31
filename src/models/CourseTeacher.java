package models;

public class CourseTeacher {
  private Course course;
  private Teacher teacher;

  public CourseTeacher(Course course, Teacher teacher) {
    this.course = course;
    this.teacher = teacher;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public String toStringCourseTeacher() {
    System.out.println(this.course.toStringCourse() + "," + this.teacher.toStringTeacher());
    return this.course.toStringCourse() + "," + this.teacher.toStringTeacher();
  }
}
