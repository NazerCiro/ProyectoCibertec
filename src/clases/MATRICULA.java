package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MATRICULA extends JFrame implements ActionListener {

 private static final long serialVersionUID = 1L;
 private JPanel contentPane;
 private JLabel lblNewLabel;
 private JLabel lblNewLabel_1;
 private JTextField txtNombre;
 private JTextField txtApellidos;
 private JLabel lblNewLabel_2;
 private JTextField txtNomApoderado;
 private JLabel lblNewLabel_3;
 private JComboBox comboBox;
 private JLabel lblNewLabel_4;
 private JTextField txtDni;
 private JLabel lblNewLabel_5;
 private JComboBox cboSede;
 private JLabel lblNewLabel_6;
 private JComboBox cboHorario;
 private JLabel lblNewLabel_7;
 private JComboBox cboCursos;
 private JLabel lblNewLabel_8;
 private JTextField txtCosto;
 private JLabel lblNewLabel_9;
 private JTextField txtFecha;
 private JButton btnMatriculate;
 private JScrollPane scrollPane;
 private JTextArea textArea;
 private JLabel lblLogo;
 private JLabel lblNewLabel_10;
 private JPanel panel;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     MATRICULA frame = new MATRICULA();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public MATRICULA() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 620, 788);
  contentPane = new JPanel();
  contentPane.setBackground(new Color(75, 75, 75));
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

  setContentPane(contentPane);
  contentPane.setLayout(null);

  lblNewLabel = new JLabel("Nombres:");
  lblNewLabel.setForeground(new Color(255, 255, 255));
  lblNewLabel.setBounds(10, 104, 93, 14);
  lblNewLabel.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  lblNewLabel.setBackground(Color.WHITE);
  contentPane.add(lblNewLabel);

  lblNewLabel_1 = new JLabel("Apellidos:");
  lblNewLabel_1.setForeground(new Color(255, 255, 255));
  lblNewLabel_1.setBounds(10, 136, 93, 14);
  lblNewLabel_1.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_1);

  txtNombre = new JTextField();
  txtNombre.setBounds(113, 98, 103, 20);
  contentPane.add(txtNombre);
  txtNombre.setColumns(10);

  txtApellidos = new JTextField();
  txtApellidos.setBounds(113, 135, 103, 20);
  contentPane.add(txtApellidos);
  txtApellidos.setColumns(10);

  lblNewLabel_2 = new JLabel("Fecha:");
  lblNewLabel_2.setForeground(new Color(255, 255, 255));
  lblNewLabel_2.setBounds(10, 353, 68, 14);
  lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_2);

  txtNomApoderado = new JTextField();
  txtNomApoderado.setBounds(10, 452, 206, 20);
  contentPane.add(txtNomApoderado);
  txtNomApoderado.setColumns(10);

  lblNewLabel_3 = new JLabel("Año:");
  lblNewLabel_3.setForeground(new Color(255, 255, 255));
  lblNewLabel_3.setBounds(10, 395, 60, 14);
  lblNewLabel_3.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_3);

  comboBox = new JComboBox();
  comboBox.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
  comboBox.setModel(new DefaultComboBoxModel(new String[] {"2025", "2026", "2027", "2028", "2029", "2030"}));
  comboBox.setBounds(113, 387, 103, 22);
  contentPane.add(comboBox);

  lblNewLabel_4 = new JLabel("DNI:");
  lblNewLabel_4.setForeground(new Color(255, 255, 255));
  lblNewLabel_4.setBounds(10, 172, 93, 14);
  lblNewLabel_4.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_4);

  txtDni = new JTextField();
  txtDni.setBounds(113, 166, 103, 20);
  contentPane.add(txtDni);
  txtDni.setColumns(10);

//Valida si el dni es int
  txtDni.addKeyListener(new KeyAdapter() {
   @Override
   public void keyReleased(KeyEvent e) {
    String texto = txtDni.getText();
    if (!texto.matches("\\d*")) {
     JOptionPane.showMessageDialog(contentPane, "Solo se permiten números en el campo DNI", "Error", JOptionPane.ERROR_MESSAGE);
     txtDni.setText(""); 
    }
   }
  });

  lblNewLabel_5 = new JLabel("SEDES:");
  lblNewLabel_5.setForeground(new Color(255, 255, 255));
  lblNewLabel_5.setBounds(10, 208, 93, 14);
  lblNewLabel_5.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_5);

  cboSede = new JComboBox();
  cboSede.setModel(new DefaultComboBoxModel(new String[] {"CALLAO", "SAN BARTOLO", "COMAS", "SAN ISIDRO"}));
  cboSede.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
  cboSede.setBounds(113, 206, 103, 22);
  contentPane.add(cboSede);

  lblNewLabel_6 = new JLabel("Horario:");
  lblNewLabel_6.setForeground(new Color(255, 255, 255));
  lblNewLabel_6.setBounds(10, 244, 93, 14);
  lblNewLabel_6.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_6);

  cboHorario = new JComboBox();
  cboHorario.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
  cboHorario.setModel(new DefaultComboBoxModel(new String[] {"MAÑANA (7:00 AM - 1:00 AM)", "TARDE( 1:00 PM - 7:30 PM )"}));
  cboHorario.setBounds(113, 239, 103, 22);
  contentPane.add(cboHorario);

  lblNewLabel_7 = new JLabel("Cursos:");
  lblNewLabel_7.setForeground(new Color(255, 255, 255));
  lblNewLabel_7.setBounds(10, 282, 93, 14);
  lblNewLabel_7.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_7);

  cboCursos = new JComboBox();
  cboCursos.addActionListener(this);
  cboCursos.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
  cboCursos.setModel(new DefaultComboBoxModel(new String[] {"ALGEBRA", "ARITMETICA", "GEOMETRIA", "GEOGRAFIA", "BIOLOGIA", "TRIGONOMETRIA", "RAZ.MATEMATICO", "INGLES", "CIENCIA", "HISTORIA "}));
  cboCursos.setBounds(113, 280, 103, 22);
  contentPane.add(cboCursos);

  lblNewLabel_8 = new JLabel("Costo:");
  lblNewLabel_8.setForeground(new Color(255, 255, 255));
  lblNewLabel_8.setBounds(10, 321, 93, 14);
  lblNewLabel_8.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_8);

  txtCosto = new JTextField();
  txtCosto.setBounds(113, 320, 103, 20);
  contentPane.add(txtCosto);
  txtCosto.setColumns(10);

  lblNewLabel_9 = new JLabel("Nombre del Apoderado:");
  lblNewLabel_9.setForeground(new Color(255, 255, 255));
  lblNewLabel_9.setBounds(10, 420, 186, 21);
  lblNewLabel_9.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  contentPane.add(lblNewLabel_9);

  txtFecha = new JTextField();
  txtFecha.setBounds(113, 351, 103, 20);
  contentPane.add(txtFecha);
  txtFecha.setColumns(10);

  btnMatriculate = new JButton("Matriculate");
  btnMatriculate.setForeground(new Color(0, 0, 0));
  btnMatriculate.setBackground(new Color(175, 18, 12));
  btnMatriculate.setFont(new Font("Roboto Medium", Font.BOLD, 15));
  btnMatriculate.setBounds(77, 483, 121, 23);
  btnMatriculate.addActionListener(this);
  contentPane.add(btnMatriculate);

  scrollPane = new JScrollPane();
  scrollPane.setBounds(10, 512, 584, 226);
  contentPane.add(scrollPane);

  textArea = new JTextArea();
  scrollPane.setViewportView(textArea);

  lblNewLabel_10 = new JLabel("");
  lblNewLabel_10.setBounds(285, 0, 331, 514);
  lblNewLabel_10.setIcon(new ImageIcon(MATRICULA.class.getResource("/Imagenes/Banner_Login.png")));
  contentPane.add(lblNewLabel_10);

  panel = new JPanel();
  panel.setBounds(0, 0, 285, 64);
  panel.setBackground(new Color(255, 255, 255));
  contentPane.add(panel);
  panel.setLayout(null);

  lblLogo = new JLabel("");
  lblLogo.setBounds(10, 0, 57, 57);
  panel.add(lblLogo);
  lblLogo.setIcon(new ImageIcon(MATRICULA.class.getResource("/Imagenes/LOGO_REAL.png")));
 }
 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == cboCursos) {
   actionPerformedCboCursos(e);
  }
  if (e.getSource() == btnMatriculate) {
   actionPerformedBtnNewButton(e);
  }
 }

 protected void actionPerformedBtnNewButton(ActionEvent e) {
  String nombre = txtNombre.getText();
  String apellidos = txtApellidos.getText();
  String dni = txtDni.getText();
  String sede = cboSede.getSelectedItem().toString();
  String horario = cboHorario.getSelectedItem().toString();
  String curso = cboCursos.getSelectedItem().toString();
  String costo = txtCosto.getText();
  String fecha = txtFecha.getText();
  String nomApoderado = txtNomApoderado.getText();

  textArea.setText("Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "DNI: " + dni + "\n" + "Sede: "
    + sede + "\n" + "Horario: " + horario + "\n" + "Curso: " + curso + "\n"+"-----------------------------------------------------" +"\n" + "Costo Total: " + costo + "\n"
                + "Fecha: " + fecha + "\n" + "Nombre del Apoderado: " + nomApoderado+"\n" + "-----------------------------------------------------" +"\n" + "MATRICULA EXITOSA");

  txtNombre.setText("");
  txtApellidos.setText("");
  txtDni.setText("");
  cboSede.setSelectedIndex(0);
  cboHorario.setSelectedIndex(0);
  cboCursos.setSelectedIndex(0);
  txtCosto.setText("");
  txtFecha.setText("");
  txtNomApoderado.setText("");
  
  JOptionPane.showMessageDialog(contentPane, "MATRICULA EXITOSA", "Información", JOptionPane.INFORMATION_MESSAGE);
 }
 protected void actionPerformedCboCursos(ActionEvent e) {
  String curso;
  curso = cboCursos.getSelectedItem().toString();
  //entrada
  if (curso == "ALGEBRA") {
   txtCosto.setText("S/. 150.00");
  } else if (curso == "ARITMETICA") {
   txtCosto.setText("S/. 120.00");
  } else if (curso == "GEOMETRIA") {
   txtCosto.setText("S/. 130.00");
  } else if (curso == "GEOGRAFIA") {
   txtCosto.setText("S/. 140.00");
  } else if (curso == "BIOLOGIA") {
   txtCosto.setText("S/. 160.00");
  } else if (curso == "TRIGONOMETRIA") {
   txtCosto.setText("S/. 170.00");
  } else if (curso == "RAZ.MATEMATICO") {
   txtCosto.setText("S/. 180.00");
  } else if (curso == "INGLES") {
   txtCosto.setText("S/. 200.00");
  } else if (curso == "CIENCIA") {
   txtCosto.setText("S/. 190.00");
  } else if (curso == "HISTORIA ") {
   txtCosto.setText("S/. 210.00");
  }
  else {
   txtCosto.setText("S/. 0.00");
  }


  if(curso != null) {
   txtFecha.setText("06/03/2025");
  }else {txtFecha.setText("");}

 }
}