package clases;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class REGISTRO extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textNombre, textApellido, textMatricula, textCarrera, textCorreo;
    private JTable table;
    private DefaultTableModel model;
    private int editingRow = -1;

    public REGISTRO() {
        setTitle("Registro de Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        getContentPane().setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel(new GridLayout(5, 2));
        panelCampos.setBackground(new Color(185, 18, 12));
        JLabel label = new JLabel("Nombre:");
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(label);
        textNombre = new JTextField();
        textNombre.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(textNombre);

        JLabel label_1 = new JLabel("Apellido:");
        label_1.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        label_1.setForeground(new Color(255, 255, 255));
        panelCampos.add(label_1);
        textApellido = new JTextField();
        textApellido.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(textApellido);

        JLabel label_2 = new JLabel("Matrícula:");
        label_2.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        label_2.setForeground(new Color(255, 255, 255));
        panelCampos.add(label_2);
        textMatricula = new JTextField();
        textMatricula.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(textMatricula);

        JLabel label_3 = new JLabel("Carrera:");
        label_3.setForeground(new Color(255, 255, 255));
        label_3.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(label_3);
        textCarrera = new JTextField();
        textCarrera.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(textCarrera);

        JLabel label_4 = new JLabel("Correo:");
        label_4.setForeground(new Color(255, 255, 255));
        label_4.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(label_4);
        textCorreo = new JTextField();
        textCorreo.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        panelCampos.add(textCorreo);

        getContentPane().add(panelCampos, BorderLayout.NORTH);

        model = new DefaultTableModel(new Object[]{"Nombre", "Apellido", "Matrícula", "Carrera", "Correo"}, 0);
        table = new JTable(model);
        table.setFont(new Font("Roboto Light", Font.BOLD, 14));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.DARK_GRAY);
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnConsultar = new JButton("Consultar");

        btnRegistrar.addActionListener(e -> {
            if (editingRow == -1) {
                model.addRow(new Object[]{
                    textNombre.getText(),
                    textApellido.getText(),
                    textMatricula.getText(),
                    textCarrera.getText(),
                    textCorreo.getText()
                });
            } else {
                model.setValueAt(textNombre.getText(), editingRow, 0);
                model.setValueAt(textApellido.getText(), editingRow, 1);
                model.setValueAt(textMatricula.getText(), editingRow, 2);
                model.setValueAt(textCarrera.getText(), editingRow, 3);
                model.setValueAt(textCorreo.getText(), editingRow, 4);
                editingRow = -1;
                btnRegistrar.setText("Registrar");
            }
            textNombre.setText("");
            textApellido.setText("");
            textMatricula.setText("");
            textCarrera.setText("");
            textCorreo.setText("");
        });

        btnEditar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                editingRow = selectedRow;
                textNombre.setText((String) model.getValueAt(selectedRow, 0));
                textApellido.setText((String) model.getValueAt(selectedRow, 1));
                textMatricula.setText((String) model.getValueAt(selectedRow, 2));
                textCarrera.setText((String) model.getValueAt(selectedRow, 3));
                textCorreo.setText((String) model.getValueAt(selectedRow, 4));
                btnRegistrar.setText("Actualizar");
            }
        });

        btnEliminar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
                editingRow = -1;
                btnRegistrar.setText("Registrar");
            }
        });

        btnConsultar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Nombre: ").append(model.getValueAt(selectedRow, 0)).append("\n");
                sb.append("Apellido: ").append(model.getValueAt(selectedRow, 1)).append("\n");
                sb.append("Matrícula: ").append(model.getValueAt(selectedRow, 2)).append("\n");
                sb.append("Carrera: ").append(model.getValueAt(selectedRow, 3)).append("\n");
                sb.append("Correo: ").append(model.getValueAt(selectedRow, 4));
                JOptionPane.showMessageDialog(this, sb.toString(), "Consulta de Registro", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panelBotones.add(btnRegistrar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnConsultar);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }
}
