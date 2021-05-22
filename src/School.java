import javax.swing.*;
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
    JFrame_myFrame.setSize(800,600);
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
    JInternalFrame_student.setSize(550,400);
    JInternalFrame_student.setVisible(false);
    JInternalFrame_student.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    //Agregando un Input y un label
    JLabel labelName = new JLabel("Nombre");
    labelName.setBounds(5,5,50,30);
    JTextField textfieldName = new JTextField(10);
    textfieldName.setBounds(120, 5, 150,30);

    JLabel labelCourse = new JLabel("Curso");
    labelCourse.setBounds(5,10,50,30);
    JTextField textfieldCourse = new JTextField(10);
    textfieldCourse.setBounds(120, 10, 150,30);

    JLabel labelScore = new JLabel("Calificacion");
    labelScore.setBounds(5,15,50,30);
    JTextField textfieldScore = new JTextField(10);
    textfieldScore.setBounds(120, 15, 150,30);

    //Agregando los botones
    JButton btnAddStudent = new JButton("Agregar");
    btnAddStudent.setBounds(5,30,80,30);
    btnAddStudent.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //System.out.println("Boton agregar estudiante al toque rey");
        String dataTextfieldName = textfieldName.getText();
        String dataTextfieldCourse = textfieldCourse.getText();
        String dataTextfieldScore = textfieldScore.getText();
        System.out.println("Obtenemos los datos de:" + dataTextfieldName);
        System.out.println("Obtenemos los datos de:" + dataTextfieldCourse);
        System.out.println("Obtenemos los datos de:" + dataTextfieldScore);
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

    JScrollPane scrollPane_student = new JScrollPane();
    JInternalFrame_student.add(scrollPane_student, BorderLayout.CENTER);
    JPanel JPanel_student = new JPanel();
    JPanel_student.add(labelName);
    JPanel_student.add(textfieldName);
    JPanel_student.add(labelCourse);
    JPanel_student.add(textfieldCourse);
    JPanel_student.add(labelScore);
    JPanel_student.add(textfieldScore);
    JPanel_student.add(btnAddStudent);
    JPanel_student.add(btnDeleteStudent);
    JInternalFrame_student.add(JPanel_student);
    JDesktopPane_myDesktopPane.add(JInternalFrame_student);

    /*TODO: Usando el JInternaFrame de los Maestros
    * Seccion JInternalFrame de los maestros
    * Estudiantes y sus calificaciones
    * */
    JInternalFrame_teacher = new JInternalFrame("Maestros", true, true, true, true);
    JInternalFrame_teacher.setSize(400,300);
    JInternalFrame_teacher.setVisible(false);
    JInternalFrame_teacher.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JButton btnAddTeacher = new JButton("Agregar");
    btnAddTeacher.setBounds(100,150,100,30);
    JButton btnDeleteTeacher = new JButton("Eliminar");
    btnDeleteTeacher.setBounds(100,150,100,30);

    JLabel labelNameStudentOnTeacher = new JLabel("Nombre");
    labelNameStudentOnTeacher.setBounds(5,15,50,30);
    JTextField textFieldNameStudentOnTeacher = new JTextField(10);
    textFieldNameStudentOnTeacher.setBounds(120, 15, 150,30);

    JLabel labelCourseStudentOnTeacher = new JLabel("Materia");
    labelCourseStudentOnTeacher.setBounds(5,15,50,30);
    JTextField textFieldCourseStudentOnTeacher = new JTextField(10);
    textFieldCourseStudentOnTeacher.setBounds(120, 15, 150,30);

    JLabel labelScoreStudentOnTeacher = new JLabel("Calificacion");
    labelScoreStudentOnTeacher.setBounds(5,15,50,30);
    JTextField textFieldScoreStudentOnTeacher = new JTextField(10);
    textFieldScoreStudentOnTeacher.setBounds(120, 15, 150,30);

    JScrollPane scrollPane_teacher = new JScrollPane();
    JInternalFrame_teacher.add(scrollPane_teacher, BorderLayout.CENTER);
    JPanel JPanel_teacher = new JPanel();
    JPanel_teacher.add(labelNameStudentOnTeacher);
    JPanel_teacher.add(textFieldNameStudentOnTeacher);
    JPanel_teacher.add(labelCourseStudentOnTeacher);
    JPanel_teacher.add(textFieldCourseStudentOnTeacher);
    JPanel_teacher.add(labelScoreStudentOnTeacher);
    JPanel_teacher.add(textFieldScoreStudentOnTeacher);

    JPanel_teacher.add(btnAddTeacher);
    JPanel_teacher.add(btnDeleteTeacher);
    JInternalFrame_teacher.add(JPanel_teacher);
    JDesktopPane_myDesktopPane.add(JInternalFrame_teacher);

    /*TODO: Estas usando el InternalFrame de los directores
    * Seccion JIntenalFrame de los directores
    * Operaciones CRUD a los siguientes:
    * Profesor y Administrador
    * */
    JInternalFrame_director = new JInternalFrame("Directores", true, true, true, true);
    JInternalFrame_director.setSize(630,400);
    JInternalFrame_director.setVisible(false);
    JInternalFrame_director.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    //Agregando los inputs y labels
    JLabel labelNameProfesorOnDirector = new JLabel("Nombre Profesor");
    labelNameProfesorOnDirector.setBounds(5,5,50,30);
    JTextField textfieldNameProfesorOnDirector = new JTextField(10);
    textfieldNameProfesorOnDirector.setBounds(120, 5, 150,30);

    JLabel labelCourseOnDirector = new JLabel("Curso");
    labelCourseOnDirector.setBounds(5,10,50,30);
    JTextField textfieldCourseOnDirector = new JTextField(10);
    textfieldCourseOnDirector.setBounds(120, 10, 150,30);

    JLabel labelNumberStudentOnDirector = new JLabel("No. de estudiantes");
    labelNumberStudentOnDirector.setBounds(5,15,50,30);
    JTextField textfieldNumberStudentOnDirector = new JTextField(10);
    textfieldNumberStudentOnDirector.setBounds(120, 15, 150,30);

    JLabel labelNumberPersonalTeacherOnDirector = new JLabel("No. de Personal");
    labelNumberPersonalTeacherOnDirector.setBounds(5,20,50,30);
    JTextField textfieldNumberPersonalTeacherOnDirector = new JTextField(10);
    textfieldNumberPersonalTeacherOnDirector.setBounds(120, 20, 150,30);

    //Input y labels de Admin en Director
    JLabel labelNameAdminOnDirector = new JLabel("Nombre Admin");
    labelNameAdminOnDirector.setBounds(50,30,100,30);
    JTextField textfieldNameAdminOnDirector = new JTextField(10);
    textfieldNameAdminOnDirector.setBounds(50,30,100,30);

    JLabel labelRoleAdminOnDirector = new JLabel("Puesto");
    labelRoleAdminOnDirector.setBounds(50,35,100,30);
    JTextField textfieldRoleAdminOnDirector = new JTextField(10);
    textfieldRoleAdminOnDirector.setBounds(50,35,100,30);

    //Agregando los botones
    JButton btnAddDirector = new JButton("Agregar");
    btnAddDirector.setBounds(5,30,80,30);
    btnAddDirector.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Boton agregar del director al toque mi rey");
        String dataTextfieldNameProfesorOnDirector = textfieldNameProfesorOnDirector.getText();
        String dataTextfieldCourseOnDirector = textfieldCourseOnDirector.getText();
        String dataTextfieldNumberStudentOnDirector = textfieldNumberStudentOnDirector.getText();
        String dataTextfieldNumberPersonalTeacherOnDirector = textfieldNumberPersonalTeacherOnDirector.getText();
        String dataTextfieldNameAdminOnDirector = textfieldNameAdminOnDirector.getText();
        String dataTextfieldRoleAdminOnDirector = textfieldRoleAdminOnDirector.getText();

        System.out.println("Obtenido del: " +dataTextfieldNameProfesorOnDirector);
        System.out.println("Obtenido del: " +dataTextfieldCourseOnDirector);
        System.out.println("Obtenido del: " +dataTextfieldNumberStudentOnDirector);
        System.out.println("Obtenido del: " +dataTextfieldNumberPersonalTeacherOnDirector);
        System.out.println("Obtenido del: " +dataTextfieldNameAdminOnDirector);
        System.out.println("Obtenido del: "+dataTextfieldRoleAdminOnDirector);
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

    JPanel JPanel_director = new JPanel();
    JPanel_director.add(labelNameProfesorOnDirector);
    JPanel_director.add(textfieldNameProfesorOnDirector);
    JPanel_director.add(labelCourseOnDirector);
    JPanel_director.add(textfieldCourseOnDirector);
    JPanel_director.add(labelNumberStudentOnDirector);
    JPanel_director.add(textfieldNumberStudentOnDirector);
    JPanel_director.add(labelNumberPersonalTeacherOnDirector);
    JPanel_director.add(textfieldNumberPersonalTeacherOnDirector);
    JPanel_director.add(labelNameAdminOnDirector);
    JPanel_director.add(textfieldNameAdminOnDirector);
    JPanel_director.add(labelRoleAdminOnDirector);
    JPanel_director.add(textfieldRoleAdminOnDirector);
    JPanel_director.add(btnAddDirector);
    JPanel_director.add(btnDeleteDirector);

    JScrollPane scrollPane_director = new JScrollPane();
    JInternalFrame_director.add(scrollPane_director, BorderLayout.CENTER);
    JInternalFrame_director.add(JPanel_director);
    JDesktopPane_myDesktopPane.add(JInternalFrame_director);

    //TODO: Estas usando el InternalFrame de Admin, lee la descripcion
    /*
     * Seccion de los administradores
     * Debe tener un crud funcional con
     * Estudiantes
     * */
    JInternalFrame_administrator = new JInternalFrame("Administradores", true, true, true, true);
    JInternalFrame_administrator.setSize(500,400);
    JInternalFrame_administrator.setVisible(false);
    JInternalFrame_administrator.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    //Agregando el JLabel Y TextField
    JLabel jlabelNameStudentOnAdmin = new JLabel("Nombre");
    jlabelNameStudentOnAdmin.setBounds(5,5,100,30);
    JTextField jtexfieldNameStudenOnAdmin = new JTextField(10);
    jtexfieldNameStudenOnAdmin.setBounds(5,5,100,30);

    JLabel jlabelDNIStudentOnAdmin = new JLabel("Matricula");
    jlabelDNIStudentOnAdmin.setBounds(5,10,100,30);
    JTextField jtexfieldDNIStudenOnAdmin = new JTextField(10);
    jtexfieldDNIStudenOnAdmin.setBounds(5,10,100,30);

    JLabel jlabelTeacherStudentOnAdmin = new JLabel("Maestro");
    jlabelTeacherStudentOnAdmin.setBounds(5,5,100,30);
    JTextField jtexfieldTeacherStudentOnAdmin = new JTextField(10);
    jtexfieldTeacherStudentOnAdmin.setBounds(5,5,100,30);

    JLabel jlabelCourseStudentOnAdmin = new JLabel("Curso");
    jlabelCourseStudentOnAdmin.setBounds(5,10,100,30);
    JTextField jtexfieldCourseStudenOnAdmin = new JTextField(10);
    jtexfieldCourseStudenOnAdmin.setBounds(5,10,100,30);

    JLabel jlabelScoreStudentOnAdmin = new JLabel("Calificacion");
    jlabelScoreStudentOnAdmin.setBounds(5,5,100,30);
    JTextField jtexfieldScoreStudentOnAdmin = new JTextField(10);
    jtexfieldScoreStudentOnAdmin.setBounds(5,5,100,30);

    JLabel jlabelDateStudentOnAdmin = new JLabel("Fecha");
    jlabelDateStudentOnAdmin.setBounds(5,10,100,30);
    JTextField jtexfieldDateStudenOnAdmin = new JTextField(10);
    jtexfieldDateStudenOnAdmin.setBounds(5,10,100,30);

    JButton btnAddStudentOnAdmin = new JButton("Agregar");
    btnAddStudentOnAdmin.setBounds(100,150,100,30);
    JButton btnDeleteStudentOnAdmin = new JButton("Eliminar");
    btnDeleteStudentOnAdmin.setBounds(100,150,100,30);

    JPanel JPanel_administrator = new JPanel();
    JPanel_administrator.add(jlabelNameStudentOnAdmin);
    JPanel_administrator.add(jtexfieldNameStudenOnAdmin);
    JPanel_administrator.add(jlabelDNIStudentOnAdmin);
    JPanel_administrator.add(jtexfieldDNIStudenOnAdmin);
    JPanel_administrator.add(jlabelTeacherStudentOnAdmin);
    JPanel_administrator.add(jtexfieldTeacherStudentOnAdmin);
    JPanel_administrator.add(jlabelCourseStudentOnAdmin);
    JPanel_administrator.add(jtexfieldCourseStudenOnAdmin);
    JPanel_administrator.add(jlabelScoreStudentOnAdmin);
    JPanel_administrator.add(jtexfieldScoreStudentOnAdmin);
    JPanel_administrator.add(jlabelDateStudentOnAdmin);
    JPanel_administrator.add(jtexfieldDateStudenOnAdmin);

    JPanel_administrator.add(btnAddStudentOnAdmin);
    JPanel_administrator.add(btnDeleteStudentOnAdmin);

    JScrollPane scrollPane_admin = new JScrollPane();
    JInternalFrame_administrator.add(scrollPane_admin, BorderLayout.CENTER);
    JInternalFrame_administrator.add(JPanel_administrator);
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
    //Esto es para la parte de los botones dentro del JInternalFrame
    if(commandString.equals("Agregar")){

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