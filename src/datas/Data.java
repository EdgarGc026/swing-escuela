package datas;

import models.Course;
import models.CourseTeacher;
import models.Student;
import models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Data {
  public List<Student> students = new ArrayList<>();
  public List<Teacher> teachers = new ArrayList<>();
  public List<Course> courses = new ArrayList<>();
  public List<CourseTeacher> courseteachers = new ArrayList<>();

  public Data(){
    Course course1 = new Course("Matematicas",8);
    Course course2 = new Course("Historia", 9);
    Course course3 = new Course("Programacion", 7);
    courses.add(course1);
    courses.add(course2);
    courses.add(course3);

    Teacher teacher1 = new Teacher("HSHG223", "Alberto Coyote");
    Teacher teacher2 = new Teacher("ULWJ923", "Julian Solis");
    Teacher teacher3 = new Teacher("Y2YS098", "Ana Cecilia");
    teachers.add(teacher1);
    teachers.add(teacher2);
    teachers.add(teacher3);

    CourseTeacher courseteachers1 = new CourseTeacher(course1, teacher1);
    CourseTeacher courseteachers2 = new CourseTeacher(course2, teacher2);
    CourseTeacher courseteachers3 = new CourseTeacher(course3, teacher3);
    courseteachers.add(courseteachers1);
    courseteachers.add(courseteachers2);
    courseteachers.add(courseteachers3);

    Student student1 = new Student("HSG223", "Juan Perez", "12/12/21", courseteachers1);
    Student student2 = new Student("HSY321", "Benito Lopez", "09/08/21", courseteachers2);
    Student student3 = new Student("UEW947", "Andrea Martinez", "17/11/21", courseteachers3);
    students.add(student1);
    students.add(student2);
    students.add(student3);
  }

  public static void main(String[] args) {
    Data data1 = new Data();
    Data data2 = new Data();
    Data data3 = new Data();
    Data data4 = new Data();

    for (int i = 0; i < data1.courses.size(); i++) {
      System.out.println(data1.courses.get(i));
    }

    System.out.println();

    for (int j = 0; j < data2.teachers.size(); j++){
      System.out.println(data2.teachers.get(j));
    }

    System.out.println();

    for (int k = 0; k<data3.courseteachers.size(); k++){
      System.out.println(data3.courseteachers.get(k));
    }

    System.out.println();

    for (int l = 0; l<data4.students.size(); l++){
      System.out.println(data4.students.get(l));
    }
  }
}
