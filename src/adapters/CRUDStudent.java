package adapters;

import models.Student;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CRUDStudent extends AbstractTableModel {
  String[] columnStudents = {"Matricula", "Nombre", "Fecha", "Materia", "Calificacion", "DNI", "Profe"};
  ArrayList<Student> list;

  public CRUDStudent(List<Student> students){
    list = new ArrayList<Student>(students);
  }

  @Override
  public int getRowCount() {
    return list.size();
  }

  public String getColumnName(int columnIndex) {
    return columnStudents[columnIndex];
  }

  @Override
  public int getColumnCount() {
    return columnStudents.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex){
      case 0:
        return this.list.get(rowIndex).getStudentDNI();
      case 1:
        return this.list.get(rowIndex).getName();
      case 2:
        return this.list.get(rowIndex).getDate();
      case 3:
        return this.list.get(rowIndex).getCourseteacher().getCourse().getName();
      case 4:
        return this.list.get(rowIndex).getCourseteacher().getCourse().getScore();
      case 5:
        return this.list.get(rowIndex).getCourseteacher().getTeacher().getPersonaNumber();
      case 6:
        return this.list.get(rowIndex).getCourseteacher().getTeacher().getName();
      default:
        return null;
    }
  }
}
