
import models.Student;
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

    /*
    * Seccion JInterfalFrame de los Estudiantes
    * */
    JInternalFrame_student = new JInternalFrame("Estudiantes", true, true,true,true);
    JInternalFrame_student.setSize(400,300);
    JInternalFrame_student.setVisible(false);
    JInternalFrame_student.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JScrollPane scrollPane_student = new JScrollPane();
    JInternalFrame_student.add(scrollPane_student, BorderLayout.CENTER);
    JDesktopPane_myDesktopPane.add(JInternalFrame_student);
    /*
    * Seccion JInternalFrame de los maestros*/
    JInternalFrame_teacher = new JInternalFrame("Maestros", true, true, true, true);
    JInternalFrame_teacher.setSize(400,300);
    JInternalFrame_teacher.setVisible(false);
    JInternalFrame_teacher.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JScrollPane scrollPane_teacher = new JScrollPane();
    JInternalFrame_teacher.add(scrollPane_teacher, BorderLayout.CENTER);
    JDesktopPane_myDesktopPane.add(JInternalFrame_teacher);

    /*
    * Seccion JIntenalFrame de los directores
    * */
    JInternalFrame_director = new JInternalFrame("Directores", true, true, true, true);
    JInternalFrame_director.setSize(400,300);
    JInternalFrame_director.setVisible(false);
    JInternalFrame_director.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JScrollPane scrollPane_director = new JScrollPane();
    JInternalFrame_teacher.add(scrollPane_director, BorderLayout.CENTER);
    JDesktopPane_myDesktopPane.add(JInternalFrame_director);

    /*
     * Seccion de los administradores
     * */
    JInternalFrame_administrator = new JInternalFrame("Administradores", true, true, true, true);
    JInternalFrame_administrator.setSize(400,300);
    JInternalFrame_administrator.setVisible(false);
    JInternalFrame_administrator.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    JScrollPane scrollPane_admin = new JScrollPane();
    JInternalFrame_teacher.add(scrollPane_admin, BorderLayout.CENTER);
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


