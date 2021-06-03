import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

import adapters.CRUDDirector;
import models.Director;

public class FrameDirect extends JInternalFrame{
  private JTable tableDirector = new JTable();
  private CRUDDirector crudDirector = new CRUDDirector();
  private JTextField textfieldIdDirector; 
  private JTextField textfieldNameDirector; 
  private JTextField textfieldJobDirector; 
  public FrameDirect(String arg0,boolean arg1,boolean arg2,boolean arg3,boolean arg4) {
    //Creamos el Frame donde estaremos mostrando el crude
    
    super(arg0,arg1,arg2,arg3,arg4);
    this.setSize(730,500);
    this.setVisible(false);
    this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    this.confInterface();   

    }

  public void confInterface(){
    //Agregando los inputs y labels
    JLabel labelNameDirector = new JLabel("Nombre");
    textfieldNameDirector = new JTextField(10);
    JLabel labelJobDirector = new JLabel("Puesto");
    textfieldJobDirector = new JTextField(10);
   JLabel labelIdDirector = new JLabel("ID");
    textfieldIdDirector = new JTextField(10);

    //Agregando los botones
    JButton btnAddDirector = new JButton("Agregar");
    btnAddDirector.setBounds(5,30,80,30);
    // Evento para agregar directores
    btnAddDirector.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String dataNameDirect = textfieldNameDirector.getText();
        String dataJobDirect = textfieldJobDirector.getText();
	String dataIdDirector = textfieldIdDirector.getText();
	if (dataNameDirect != null && dataJobDirect != null && dataIdDirector != null) {
	  if (dataNameDirect.length() > 0 && dataJobDirect.length() > 0 && dataIdDirector.length() > 0) {
			Director director = new Director(dataIdDirector.trim(),dataNameDirect.trim(), dataJobDirect.trim());
			crudDirector.add(director);
			System.out.println(director.toStringDirector());
			if(crudDirector.agregarDirector(director.toStringDirector())){
				clearTextField();
			}
		}	
	}
      }
    });
    JButton btnDeleteDirector = new JButton("Eliminar");
    btnDeleteDirector.setBounds(5,30,80,30);
    btnDeleteDirector.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("btn eliminar del director al 100");
      }
    });

    tableDirector.setModel(crudDirector);
    // Evento para seleccionar directores
    tableDirector.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        int indexRow = tableDirector.getSelectedRow();
        String directorName = tableDirector.getValueAt(indexRow, 0).toString();
        String directorJob = tableDirector.getValueAt(indexRow, 1).toString();
        textfieldNameDirector.setText(directorName);
        textfieldJobDirector.setText(directorJob);
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }
    });

    JPanel JPanel_director = new JPanel();
    JPanel_director.add(labelIdDirector);
    JPanel_director.add(textfieldIdDirector);
    JPanel_director.add(labelNameDirector);
    JPanel_director.add(textfieldNameDirector);
    JPanel_director.add(labelJobDirector);
    JPanel_director.add(textfieldJobDirector);
    JPanel_director.add(btnAddDirector);
    JPanel_director.add(btnDeleteDirector);

    JScrollPane scrollPane_director = new JScrollPane(tableDirector);
    this.add(scrollPane_director, BorderLayout.CENTER);
    this.add(JPanel_director, BorderLayout.PAGE_END);

  }
 
  public void clearTextField(){
	 textfieldNameDirector.setText("");
	 textfieldJobDirector.setText("");
	 textfieldIdDirector.setText("");
  }
}
