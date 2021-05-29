package adapters;
import models.Teacher;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CRUDTeacher extends AbstractTableModel {
  String[] columnTeachers = {"Nombre", "DNI"};
  ArrayList<Teacher> list;

  public CRUDTeacher(List<Teacher> teachers){
    list = new ArrayList<Teacher>(teachers);
  }

  @Override
  public int getRowCount() {
    return list.size();
  }

  public String getColumnName(int columnIndex) {
    return columnTeachers[columnIndex];
  }

  @Override
  public int getColumnCount() {
    return columnTeachers.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex){
      case 0:
        return this.list.get(rowIndex).getName();
      case 1:
        return this.list.get(rowIndex).getPersonaNumber();
      default:
        return null;
    }
  }

  public boolean isCellEditable(int rowIndex, int columnIndex){
    if(columnIndex > 0){
      return true;
    }
    return false;
  }
}