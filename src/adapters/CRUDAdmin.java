package adapters;

import models.Admin;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CRUDAdmin extends AbstractTableModel {
  String [] columnAdmins = {"Nombre", "Puesto"};
  ArrayList<Admin> list;

  public CRUDAdmin(List<Admin> admins){
   list = new ArrayList<Admin>(admins);
  }

  @Override
  public int getRowCount() {
    return list.size();
  }

  public String getColumnName(int columnIndex) {
    return columnAdmins[columnIndex];
  }

  @Override
  public int getColumnCount() {
    return columnAdmins.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex){
      case 0:
        return this.list.get(rowIndex).getName();
      case 1:
        return this.list.get(rowIndex).getJob();
      default:
        return null;
    }
  }
}
