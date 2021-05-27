import java.awt.BorderLayout;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import adapters.CRUDStudent;

import datas.Data;
public class FrameStudents extends JInternalFrame{


  public FrameStudents(String arg0,boolean arg1,boolean arg2,boolean arg3,boolean arg4) {
    //Creamos el Frame donde estaremos mostrando el crude
    super(arg0,arg1,arg2,arg3,arg4);
    this.setSize(700,500);
    this.setVisible(false);
    this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    this.confInterface();   

    }

  public void confInterface(){
    Data myData = new Data();
    JLabel labelDNIStudent = new JLabel("Matricula");
    JTextField texfieldStudentDNI = new JTextField(10);
    JLabel labelNameStudent = new JLabel("Nombre");
    JTextField textfieldNameStudent = new JTextField(10);
    JLabel labelDateStudent = new JLabel("Fecha");
    JTextField textfielDateStudent = new JTextField(10);
    JLabel labelCourseStudent = new JLabel("Materia");
    JTextField textfieldCourseStudent = new JTextField(10);
    JLabel labelScoreStudent = new JLabel("Calificacion");
    JTextField textfieldScoreStudent = new JTextField(10);
    JLabel labelDNITeacherOnStudent = new JLabel("DNI");
    JTextField texfieldDNITeacherOnStudent = new JTextField(10);
    JLabel labelNameTeacherOnStudent = new JLabel("Profesor");
    JTextField textfieldNameTeacherOnStudent = new JTextField(10);

    //Agregando los botones
    JButton btnAddStudent = new JButton("Agregar");
    btnAddStudent.setBounds(5,30,80,30);
    btnAddStudent.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String dataTextfieldStudentDNI = texfieldStudentDNI.getText();
        String dataTextfieldNameStudent = textfieldNameStudent.getText();
        String dateTexfieldDateStudent = textfielDateStudent.getText();
        String dataTextfieldCourseStudent = textfieldCourseStudent.getText();
        String dataTextfieldScoreStudent = textfieldScoreStudent.getText();
        String dataTextfieldNameTeacherStudent = textfieldNameTeacherOnStudent.getText();
        String dataTexfieldDNITeacherStudent = texfieldDNITeacherOnStudent.getText();

        System.out.println("Obtenemos los datos de:" + dataTextfieldStudentDNI);
        System.out.println("Obtenemos los datos de:" + dataTextfieldNameStudent);
        System.out.println("Obtenemos los datos de:" + dateTexfieldDateStudent);
        System.out.println("Obtenemos los datos de:" + dataTextfieldCourseStudent);
        System.out.println("Obtenemos los datos de:" + dataTextfieldScoreStudent);
        System.out.println("Obtenemos los datos de:" + dataTextfieldNameTeacherStudent);
        System.out.println("Obtenemos los datos de:" + dataTexfieldDNITeacherStudent);
      }
    });

    JButton btnDeleteStudent = new JButton("Eliminar");
    btnDeleteStudent.setBounds(5,30,80,30);
    btnDeleteStudent.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Boton eliminar estudiante al toque rey");
      }
    });

    JTable tableStudent = new JTable();
    tableStudent.setModel(new CRUDStudent(myData.students));

    JScrollPane scrollPane_student = new JScrollPane(tableStudent);
    this.add(scrollPane_student);
    JPanel JPanel_student = new JPanel();

    JPanel_student.add(labelDNIStudent);
    JPanel_student.add(texfieldStudentDNI);
    JPanel_student.add(labelNameStudent);
    JPanel_student.add(textfieldNameStudent);
    JPanel_student.add(labelDateStudent);
    JPanel_student.add(textfielDateStudent);
    JPanel_student.add(labelCourseStudent);
    JPanel_student.add(textfieldCourseStudent);
    JPanel_student.add(labelScoreStudent);
    JPanel_student.add(textfieldScoreStudent);
    JPanel_student.add(labelDNITeacherOnStudent);
    JPanel_student.add(texfieldDNITeacherOnStudent);
    JPanel_student.add(labelNameTeacherOnStudent);
    JPanel_student.add(textfieldNameTeacherOnStudent);
    JPanel_student.add(btnAddStudent);
    JPanel_student.add(btnDeleteStudent);

    JPanel_student.setBorder(new EmptyBorder(0,0,40,0));
    this.add(scrollPane_student, BorderLayout.CENTER);
    this.add(JPanel_student, BorderLayout.PAGE_END);

  }
 
}
