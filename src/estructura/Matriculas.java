package estructura;

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

public class Matriculas extends JFrame implements ActionListener {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matriculas frame = new Matriculas();
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
	public Matriculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 788);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombres:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 104, 93, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 136, 93, 14);
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
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 364, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 452, 206, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 395, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setBounds(113, 387, 103, 22);
		contentPane.add(comboBox);
		
		lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 172, 93, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 166, 103, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Matricula:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 208, 93, 14);
		contentPane.add(lblNewLabel_5);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(113, 206, 103, 22);
		contentPane.add(comboBox_1);
		
		lblNewLabel_6 = new JLabel("Horario:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 244, 93, 14);
		contentPane.add(lblNewLabel_6);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(113, 239, 103, 22);
		contentPane.add(comboBox_2);
		
		lblNewLabel_7 = new JLabel("Cursos:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 282, 93, 14);
		contentPane.add(lblNewLabel_7);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(113, 280, 103, 22);
		contentPane.add(comboBox_3);
		
		lblNewLabel_8 = new JLabel("Costo:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(10, 321, 93, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 320, 103, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Nombre del Apoderado:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(10, 420, 156, 21);
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 358, 103, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("Matriculate");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(113, 483, 103, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 512, 584, 226);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Matriculas.class.getResource("/Imagenes/LOGO_REAL.png")));
		lblLogo.setBounds(10, 11, 57, 57);
		contentPane.add(lblLogo);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Matriculas.class.getResource("/Imagenes/Banner_Login.png")));
		lblNewLabel_10.setBounds(285, 0, 331, 514);
		contentPane.add(lblNewLabel_10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
	}
}
