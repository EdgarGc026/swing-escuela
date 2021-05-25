package adapter;

import models.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDStudent {
  ArrayList<Student> list = new ArrayList<>();

  public CRUDStudent(List<Student> students){
    list = new ArrayList<Student>(students);
  }

}
