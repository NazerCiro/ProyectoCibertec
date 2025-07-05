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

public class MATRICULA extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_6;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_8;
	private JTextField textField_4;
	private JLabel lblNewLabel_9;
	private JTextField textField_5;
	private JButton btnNewButton;
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
		
		textField = new JTextField();
		textField.setBounds(113, 98, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 135, 103, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fecha:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 353, 68, 14);
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 452, 206, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 166, 103, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("SEDES:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 208, 93, 14);
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"CALLAO", "SAN BARTOLO", "COMAS", "SAN ISIDRO"}));
		comboBox_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		comboBox_1.setBounds(113, 206, 103, 22);
		contentPane.add(comboBox_1);
		
		lblNewLabel_6 = new JLabel("Horario:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 244, 93, 14);
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"MAÑANA (7:00 AM - 1:00 AM)", "TARDE( 1:00 PM - 7:30 PM )"}));
		comboBox_2.setBounds(113, 239, 103, 22);
		contentPane.add(comboBox_2);
		
		lblNewLabel_7 = new JLabel("Cursos:");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(10, 282, 93, 14);
		lblNewLabel_7.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_7);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"ALGEBRA", "ARITMETICA", "GEOMETRIA", "GEOGRAFIA", "BIOLOGIA", "TRIGONOMETRIA", "RAZ.MATEMATICO", "INGLES", "CIENCIA", "HISTORIA "}));
		comboBox_3.setBounds(113, 280, 103, 22);
		contentPane.add(comboBox_3);
		
		lblNewLabel_8 = new JLabel("Costo:");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(10, 321, 93, 14);
		lblNewLabel_8.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 320, 103, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Nombre del Apoderado:");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(10, 420, 186, 21);
		lblNewLabel_9.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 351, 103, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("Matriculate");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(175, 18, 12));
		btnNewButton.setFont(new Font("Roboto Medium", Font.BOLD, 15));
		btnNewButton.setBounds(77, 483, 121, 23);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
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
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
	}
}
