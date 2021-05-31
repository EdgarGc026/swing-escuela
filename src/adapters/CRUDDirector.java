package adapters;


import java.util.Arrays;
import models.Director;
import connects.TextFile;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.io.File;

public class CRUDDirector extends AbstractTableModel {
  String[] colunmDirectors = {"id","Nombre", "Puesto"};
  private ArrayList<Director> list; 

  public CRUDDirector(){
    this.list = this.obtenerDirectoresTabla();
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
        return this.list.get(rowIndex).getPersonalNum();
      case 1:
        return this.list.get(rowIndex).getName();
      case 2:
        return this.list.get(rowIndex).getJob();
      default:
        return null;
    }
  }
 // se agrega el objeto utilizando toSTring del objeto
  public boolean agregarDirector(String directorText){
    	boolean guardado = false;
	TextFile textFile = new TextFile("director.txt");
	guardado = textFile.insertOnFileText(directorText);
	return guardado;
  }

  public boolean actualizarDirector(String oldText, String newText){
    	boolean guardado = false;
	TextFile textFile = new TextFile("director.txt");
	guardado = textFile.updateLineFileText(oldText, newText);
	return guardado;
  }

  public boolean eliminarDirector(String directorText){
    	boolean guardado = false;
	TextFile textFile = new TextFile("director.txt");
	guardado = textFile.deleteLineFileText(directorText);
	return guardado;
  }


  public ArrayList<Director> obtenerDirectoresTabla(){
    	File tempFile = new File("connects/director.txt");
        ArrayList<Director> listaFinal = new ArrayList<Director>();
	if(tempFile.exists()){
	TextFile textFile = new TextFile("director.txt");
	String[] segundoSplit = null;
	String directoresString = textFile.readFileText();
	String[] primerSplit = directoresString.split(";");
		for (String string : primerSplit) {
	  	segundoSplit = string.split(",");
		System.out.println(Arrays.toString(segundoSplit));
		listaFinal.add(new Director(segundoSplit[0],segundoSplit[1],segundoSplit[2]));
	  	}
	}
	return listaFinal;
  }


}
