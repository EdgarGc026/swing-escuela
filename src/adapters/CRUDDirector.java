package adapters;


import models.Director;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CRUDDirector extends AbstractTableModel {
  String[] colunmDirectors = {"Nombre", "Puesto"};
  ArrayList<Director> list;

  public CRUDDirector(List<Director> directors){
    list = new ArrayList<Director>(directors);
  }

  @Override
  public int getRowCount() {
    return list.size();
  }
  public String getColumnName(int columnIndex) {
    return colunmDirectors[columnIndex];
  }

  @Override
  public int getColumnCount() {
    return colunmDirectors.length;
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
