import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import adapters.CRUDAdmin;
import datas.Data;

public class FrameAdmin extends JInternalFrame{


  public FrameAdmin(String arg0,boolean arg1,boolean arg2,boolean arg3,boolean arg4) {
    //Creamos el Frame donde estaremos mostrando el crude
    super(arg0,arg1,arg2,arg3,arg4);
    this.setSize(730,500);
    this.setVisible(false);
    this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    this.confInterface();   

    }

  public void confInterface(){
    Data myData = new Data();
    JLabel labelNameAdmin = new JLabel("Nombre");
    JTextField texfieldNameAdmin = new JTextField(10);

    JLabel labelJobAdmin = new JLabel("Puesto");
    JTextField texfieldJobAdmin = new JTextField(10);

    JButton btnAddStudentOnAdmin = new JButton("Agregar");
    btnAddStudentOnAdmin.setBounds(100,150,100,30);
    btnAddStudentOnAdmin.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String dataNameAdmin = texfieldNameAdmin.getText();
        String dataJobAdmin = texfieldJobAdmin.getText();

        System.out.println("Obteniendo datos de: " +dataNameAdmin);
        System.out.println("Obteniendo datos de: " +dataJobAdmin);
      }
    });

    JButton btnDeleteStudentOnAdmin = new JButton("Eliminar");
    btnDeleteStudentOnAdmin.setBounds(100,150,100,30);
    btnDeleteStudentOnAdmin.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Boton delete puchao");
      }
    });

    JTable tableAdmin = new JTable();
    tableAdmin.setModel(new CRUDAdmin(myData.admins));
    tableAdmin.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        int indexRow = tableAdmin.getSelectedRow();
        String adminName = tableAdmin.getValueAt(indexRow, 0).toString();
        String adminJob = tableAdmin.getValueAt(indexRow,1).toString();
        texfieldNameAdmin.setText(adminName);
        texfieldJobAdmin.setText(adminJob);
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

    JPanel JPanel_administrator = new JPanel();
    JPanel_administrator.add(labelNameAdmin);
    JPanel_administrator.add(texfieldNameAdmin);
    JPanel_administrator.add(labelJobAdmin);
    JPanel_administrator.add(texfieldJobAdmin);
    JPanel_administrator.add(btnAddStudentOnAdmin);
    JPanel_administrator.add(btnDeleteStudentOnAdmin);

    JScrollPane scrollPane_admin = new JScrollPane(tableAdmin);
    this.add(scrollPane_admin, BorderLayout.CENTER);
    this.add(JPanel_administrator, BorderLayout.PAGE_END);

  }
 
}
