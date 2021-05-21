package adapter;

import models.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MyListUserModel  {
  ArrayList<Student> list = new ArrayList<>();

  public MyListUserModel(List<Student> students){
    list = new ArrayList<Student>(students);
  }

}
