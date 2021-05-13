package adapter;

import models.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MyListUserModel  {
  private static final long serialVersonUID = 40L;
  ArrayList<Student> list = new ArrayList<>();

  public MyListUserModel(List<Student> students){
    list = new ArrayList<Student>(students);
  }

}
