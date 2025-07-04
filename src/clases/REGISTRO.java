package clases;
import javax.swing.*;
public class REGISTRO extends JFrame {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 private JTextField textField;
 private JTextField textField_1;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_4;
 private JTable table;

public REGISTRO() {
     setTitle("REGISTRO");
     setSize(530, 437);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     getContentPane().setLayout(null);
     
     JLabel lblNewLabel = new JLabel("Nombre:");
     lblNewLabel.setBounds(23, 79, 68, 20);
     getContentPane().add(lblNewLabel);
     
     textField = new JTextField();
     textField.setBounds(87, 36, 86, 20);
     getContentPane().add(textField);
     textField.setColumns(10);
     
     JLabel lblNewLabel_1 = new JLabel("Apellido:");
     lblNewLabel_1.setBounds(22, 119, 46, 14);
     getContentPane().add(lblNewLabel_1);
     
     textField_1 = new JTextField();
     textField_1.setBounds(87, 79, 86, 20);
     getContentPane().add(textField_1);
     textField_1.setColumns(10);
     
     JLabel lblNewLabel_2 = new JLabel("Codigo:");
     lblNewLabel_2.setBounds(22, 39, 46, 14);
     getContentPane().add(lblNewLabel_2);
     
     textField_2 = new JTextField();
     textField_2.setBounds(87, 116, 86, 20);
     getContentPane().add(textField_2);
     textField_2.setColumns(10);
     
     JLabel lblNewLabel_3 = new JLabel("New label");
     lblNewLabel_3.setBounds(242, 39, 46, 14);
     getContentPane().add(lblNewLabel_3);
     
     JLabel lblNewLabel_4 = new JLabel("New label");
     lblNewLabel_4.setBounds(242, 82, 46, 14);
     getContentPane().add(lblNewLabel_4);
     
     textField_3 = new JTextField();
     textField_3.setBounds(316, 36, 86, 20);
     getContentPane().add(textField_3);
     textField_3.setColumns(10);
     
     textField_4 = new JTextField();
     textField_4.setBounds(316, 79, 86, 20);
     getContentPane().add(textField_4);
     textField_4.setColumns(10);
     
     JScrollPane scrollPane = new JScrollPane();
     scrollPane.setBounds(10, 158, 494, 212);
     getContentPane().add(scrollPane);
     
     table = new JTable();
     scrollPane.setViewportView(table);
 }
}