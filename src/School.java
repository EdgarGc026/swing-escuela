import adapters.CRUDAdmin;
import adapters.CRUDDirector;
import adapters.CRUDStudent;
import adapters.CRUDTeacher;
import datas.Data;
import models.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class School implements ActionListener {
  JMenuBar JMenuBar_myMenu;
  JFrame JFrame_myFrame;
  JDesktopPane JDesktopPane_myDesktopPane;

  //Internal Frame
  JInternalFrame JInternalFrame_student;
  JInternalFrame JInternalFrame_teacher;
  JInternalFrame JInternalFrame_director;
  JInternalFrame JInternalFrame_administrator;

  School(){
    //Creamos el frame principal
    JFrame_myFrame = new JFrame("Registro escolar");
    JFrame_myFrame.setSize(900,700);
    JFrame_myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Creamos un menuBar
    JMenuBar_myMenu = new JMenuBar();
    /*
    *Cargando el menu principal
    * */
    makeMenuStudent();
    makeMenuTeacher();
    makeMenuDirector();
    makeMenuAdmin();
    Data myData = new Data();
    JFrame_myFrame.setJMenuBar(JMenuBar_myMenu);

    //Creamos un JDesktopPane  para nuestro programa MDI, Multiple Document Interface
    JDesktopPane_myDesktopPane = new JDesktopPane();
    JDesktopPane_myDesktopPane.setBackground(Color.GRAY);
    JFrame_myFrame.setContentPane(JDesktopPane_myDesktopPane);

    /*TODO: Estas usando el JInternalFrame de los estudiantes
    * Seccion JInterfalFrame de los Estudiantes
    * Muestra las calificaciones de los Estudiantes
    * Solo puedes ver las materias.
    * */
    JInternalFrame_student = new JInternalFrame("Estudiantes", true, true,true,true);
    JInternalFrame_student.setSize(700,500);
    JInternalFrame_student.setVisible(false);
    JInternalFrame_student.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

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
    JInternalFrame_student.add(scrollPane_student);
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
    JInternalFrame_student.add(scrollPane_student, BorderLayout.CENTER);
    JInternalFrame_student.add(JPanel_student, BorderLayout.PAGE_END);
    JDesktopPane_myDesktopPane.add(JInternalFrame_student);

    /*TODO: Usando el JInternaFrame de los Maestros
    * Seccion JInternalFrame de los maestros
    * Estudiantes y sus calificaciones
    * */
    JInternalFrame_teacher = new JInternalFrame("Maestros", true, true, true, true);
    JInternalFrame_teacher.setSize(700,500);
    JInternalFrame_teacher.setVisible(false);
    JInternalFrame_teacher.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JLabel labelNameTeacher = new JLabel("Nombre");
    JTextField textFieldNameTeacher = new JTextField(10);

    JLabel labelDNITeacher = new JLabel("DNI");
    JTextField textFieldDNITeacher = new JTextField(10);

    JButton btnAddTeacher = new JButton("Agregar");
    btnAddTeacher.setBounds(100,150,100,30);
    btnAddTeacher.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String dataNameTeacher = textFieldNameTeacher.getText();
        String dataDNITeacher = textFieldDNITeacher.getText();

        System.out.println("Obtenido de:" +dataNameTeacher);
        System.out.println("Obtenido de:" +dataDNITeacher);
      }
    });

    JButton btnDeleteTeacher = new JButton("Eliminar");
    btnDeleteTeacher.setBounds(100,150,100,30);
    btnDeleteTeacher.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Delete Maestro al pedo, parce");
      }
    });

    JTable tableTeacher = new JTable();
    tableTeacher.setModel(new CRUDTeacher(myData.teachers));

    JScrollPane scrollPane_teacher = new JScrollPane(tableTeacher);
    JPanel JPanel_teacher = new JPanel();
    JPanel_teacher.add(labelNameTeacher);
    JPanel_teacher.add(textFieldNameTeacher);
    JPanel_teacher.add(labelDNITeacher);
    JPanel_teacher.add(textFieldDNITeacher);
    JPanel_teacher.add(btnAddTeacher);
    JPanel_teacher.add(btnDeleteTeacher);

    JInternalFrame_teacher.add(scrollPane_teacher, BorderLayout.CENTER);
    JInternalFrame_teacher.add(JPanel_teacher, BorderLayout.PAGE_END);
    JDesktopPane_myDesktopPane.add(JInternalFrame_teacher);

    /*TODO: Estas usando el InternalFrame de los directores
    * Seccion JIntenalFrame de los directores
    * Operaciones CRUD a los siguientes:
    * Profesor y Administrador
    * */
    JInternalFrame_director = new JInternalFrame("Directores", true, true, true, true);
    JInternalFrame_director.setSize(730,500);
    JInternalFrame_director.setVisible(false);
    JInternalFrame_director.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    //Agregando los inputs y labels
    JLabel labelNameDirector = new JLabel("Nombre");
    JTextField textfieldNameDirector = new JTextField(10);
    JLabel labelJobDirector = new JLabel("Puesto");
    JTextField textfieldJobDirector = new JTextField(10);

    //Agregando los botones
    JButton btnAddDirector = new JButton("Agregar");
    btnAddDirector.setBounds(5,30,80,30);
    btnAddDirector.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Boton agregar del director al toque mi rey");
        String dataTextfieldNameDirector = textfieldNameDirector.getText();
        String dataTextfieldJobDirector = textfieldJobDirector.getText();

        System.out.println("Obtenido del: " +dataTextfieldNameDirector);
        System.out.println("Obtenido del: " +dataTextfieldJobDirector);
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

    JTable tableDirector = new JTable();
    tableDirector.setModel(new CRUDDirector(myData.directors));

    JPanel JPanel_director = new JPanel();
    JPanel_director.add(labelNameDirector);
    JPanel_director.add(textfieldNameDirector);
    JPanel_director.add(labelJobDirector);
    JPanel_director.add(textfieldJobDirector);
    JPanel_director.add(btnAddDirector);
    JPanel_director.add(btnDeleteDirector);

    JScrollPane scrollPane_director = new JScrollPane(tableDirector);
    JInternalFrame_director.add(scrollPane_director, BorderLayout.CENTER);
    JInternalFrame_director.add(JPanel_director, BorderLayout.PAGE_END);
    JDesktopPane_myDesktopPane.add(JInternalFrame_director);

    //TODO: Estas usando el InternalFrame de Admin, lee la descripcion
    /*
     * Seccion de los administradores
     * Debe tener un crud funcional con
     * Estudiantes
     * */
    JInternalFrame_administrator = new JInternalFrame("Administradores", true, true, true, true);
    JInternalFrame_administrator.setSize(700,500);
    JInternalFrame_administrator.setVisible(false);
    JInternalFrame_administrator.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    //Agregando el JLabel Y TextField
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

    JPanel JPanel_administrator = new JPanel();
    JPanel_administrator.add(labelNameAdmin);
    JPanel_administrator.add(texfieldNameAdmin);
    JPanel_administrator.add(labelJobAdmin);
    JPanel_administrator.add(texfieldJobAdmin);
    JPanel_administrator.add(btnAddStudentOnAdmin);
    JPanel_administrator.add(btnDeleteStudentOnAdmin);

    JScrollPane scrollPane_admin = new JScrollPane(tableAdmin);
    JInternalFrame_administrator.add(scrollPane_admin, BorderLayout.CENTER);
    JInternalFrame_administrator.add(JPanel_administrator, BorderLayout.PAGE_END);
    JDesktopPane_myDesktopPane.add(JInternalFrame_administrator);

    // Mostramos el Frame.
    JFrame_myFrame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    //Obtenemos el "Action command del event dispatching thread
    String commandString = actionEvent.getActionCommand();

    //Imprimio en consola esta accion
    System.out.println(commandString);

    //De esta manera podemos saber en donde fue disparado el evento
    if(commandString.equals("Ver estudiantes")){
        JInternalFrame_student.setVisible(true);
    }
    if (commandString.equals("Opciones maestro")){
      JInternalFrame_teacher.setVisible(true);
    }
    if (commandString.equals("Opciones director")){
      JInternalFrame_director.setVisible(true);
    }
    if (commandString.equals("Opciones administrador")){
      JInternalFrame_administrator.setVisible(true);
    }
  }

  void makeMenuStudent(){
    JMenu JMenu_Students = new JMenu("Estudiantes");
    JMenuItem JMenuItem_show = new JMenuItem("Ver estudiantes");
    JMenuItem_show.setToolTipText("Ver estudiantes");
    JMenu_Students.add(JMenuItem_show);
    JMenuItem_show.addActionListener(this);
    JMenuBar_myMenu.add(JMenu_Students);
  }

  void makeMenuTeacher(){
    JMenu JMenu_teachers = new JMenu("Maestros");
    JMenuItem JMenuItem_show = new JMenuItem("Opciones maestro");
    JMenuItem_show.setToolTipText("Opciones profesor");
    JMenu_teachers.add(JMenuItem_show);
    JMenuItem_show.addActionListener(this);
    JMenuBar_myMenu.add(JMenu_teachers);
  }

  void makeMenuDirector(){
    JMenu JMenu_directors = new JMenu("Directores");
    JMenuItem JMenuItem_show = new JMenuItem("Opciones director");
    JMenuItem_show.setToolTipText("Opciones director");
    JMenu_directors.add(JMenuItem_show);
    JMenuItem_show.addActionListener(this);
    JMenuBar_myMenu.add(JMenu_directors);
  }

  void makeMenuAdmin(){
    JMenu JMenu_admins = new JMenu("Administradores");
    JMenuItem JMenuItem_show = new JMenuItem("Opciones administrador");
    JMenuItem_show.setToolTipText("Opciones administrador");
    JMenu_admins.add(JMenuItem_show);
    JMenuItem_show.addActionListener(this);
    JMenuBar_myMenu.add(JMenu_admins);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new School();
      }
    });
  }
}
