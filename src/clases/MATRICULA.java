
package clases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MATRICULA extends JFrame {
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

    public MATRICULA() {
        setTitle("MATRICULA");
        setSize(926, 548);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setBounds(100, 100, 620, 597);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(183, 18, 12));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel = new JLabel("Nombres:");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setBounds(10, 34, 93, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("Apellidos:");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 59, 93, 14);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(113, 31, 103, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(113, 56, 103, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        lblNewLabel_2 = new JLabel("Fecha :");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_2.setBounds(333, 34, 93, 14);
        contentPane.add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(388, 31, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        lblNewLabel_3 = new JLabel(" Año :");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_3.setBounds(333, 59, 46, 14);
        contentPane.add(lblNewLabel_3);

        comboBox = new JComboBox();
        comboBox.setBounds(388, 55, 86, 22);
        contentPane.add(comboBox);

        lblNewLabel_4 = new JLabel("DNI:");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_4.setBounds(10, 84, 93, 14);
        contentPane.add(lblNewLabel_4);

        textField_3 = new JTextField();
        textField_3.setBounds(113, 81, 103, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        lblNewLabel_5 = new JLabel("Matricula:");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_5.setBounds(10, 115, 93, 14);
        contentPane.add(lblNewLabel_5);

        comboBox_1 = new JComboBox();
        comboBox_1.setBounds(113, 111, 103, 22);
        contentPane.add(comboBox_1);

        lblNewLabel_6 = new JLabel("Horario:");
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_6.setBounds(10, 151, 93, 14);
        contentPane.add(lblNewLabel_6);

        comboBox_2 = new JComboBox();
        comboBox_2.setBounds(113, 144, 103, 22);
        contentPane.add(comboBox_2);

        lblNewLabel_7 = new JLabel("Cursos:");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_7.setBounds(10, 183, 93, 14);
        contentPane.add(lblNewLabel_7);

        comboBox_3 = new JComboBox();
        comboBox_3.setBounds(113, 177, 103, 22);
        contentPane.add(comboBox_3);

        lblNewLabel_8 = new JLabel("Costo:");
        lblNewLabel_8.setForeground(new Color(255, 255, 255));
        lblNewLabel_8.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_8.setBounds(10, 222, 93, 14);
        contentPane.add(lblNewLabel_8);

        textField_4 = new JTextField();
        textField_4.setBounds(113, 221, 103, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        lblNewLabel_9 = new JLabel("Nombre del Apoderado:");
        lblNewLabel_9.setForeground(new Color(255, 255, 255));
        lblNewLabel_9.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        lblNewLabel_9.setBounds(333, 84, 177, 21);
        contentPane.add(lblNewLabel_9);

        textField_5 = new JTextField();
        textField_5.setBounds(333, 113, 159, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        btnNewButton = new JButton("Matriculate");
        btnNewButton.setBounds(113, 268, 103, 23);
        contentPane.add(btnNewButton);

        // Register ActionListener for the button
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionPerformedBtnNewButton(e);
            }
        });

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 322, 584, 225);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
    }

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

    protected void actionPerformedBtnNewButton(ActionEvent e) {
        // Example: Show entered data in the text area
        String nombres = textField.getText();
        String apellidos = textField_1.getText();
        String fecha = textField_2.getText();
        String anio = comboBox.getSelectedItem() != null ? comboBox.getSelectedItem().toString() : "";
        String dni = textField_3.getText();
        String matricula = comboBox_1.getSelectedItem() != null ? comboBox_1.getSelectedItem().toString() : "";
        String horario = comboBox_2.getSelectedItem() != null ? comboBox_2.getSelectedItem().toString() : "";
        String curso = comboBox_3.getSelectedItem() != null ? comboBox_3.getSelectedItem().toString() : "";
        String costo = textField_4.getText();
        String apoderado = textField_5.getText();

        textArea.setText(
            "Nombres: " + nombres + "\n" +
            "Apellidos: " + apellidos + "\n" +
            "Fecha: " + fecha + "\n" +
            "Año: " + anio + "\n" +
            "DNI: " + dni + "\n" +
            "Matricula: " + matricula + "\n" +
            "Horario: " + horario + "\n" +
            "Curso: " + curso + "\n" +
            "Costo: " + costo + "\n" +
            "Nombre del Apoderado: " + apoderado
        );
    }

    // Getters and setters (if needed)...
}
