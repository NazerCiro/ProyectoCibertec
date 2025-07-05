
package clases;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class REGISTRO extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textNombre, textApellido, textDni, textSede, textHorario, textCurso, textCosto, textFecha, textApoderado;
    private JTable table;
    private DefaultTableModel model;
    private int editingRow = -1;

    public REGISTRO() {
        setTitle("Registro de Datos");
        setBounds(100, 100, 800, 400);
        getContentPane().setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel(new GridLayout(9, 2));
        panelCampos.setBackground(new Color(185, 18, 12));

        panelCampos.add(createLabel("Nombre:"));
        textNombre = new JTextField();
        panelCampos.add(textNombre);

        panelCampos.add(createLabel("Apellidos:"));
        textApellido = new JTextField();
        panelCampos.add(textApellido);

        panelCampos.add(createLabel("DNI:"));
        textDni = new JTextField();
        panelCampos.add(textDni);

        panelCampos.add(createLabel("Sede:"));
        textSede = new JTextField();
        panelCampos.add(textSede);

        panelCampos.add(createLabel("Horario:"));
        textHorario = new JTextField();
        panelCampos.add(textHorario);

        panelCampos.add(createLabel("Curso:"));
        textCurso = new JTextField();
        panelCampos.add(textCurso);

        panelCampos.add(createLabel("Costo:"));
        textCosto = new JTextField();
        panelCampos.add(textCosto);

        panelCampos.add(createLabel("Fecha:"));
        textFecha = new JTextField();
        panelCampos.add(textFecha);

        panelCampos.add(createLabel("Apoderado:"));
        textApoderado = new JTextField();
        panelCampos.add(textApoderado);

        getContentPane().add(panelCampos, BorderLayout.NORTH);

        model = new DefaultTableModel(new Object[]{"Nombre", "Apellidos", "DNI", "Sede", "Horario", "Curso", "Costo", "Fecha", "Apoderado"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        cargarDatos();

        JPanel panelBotones = new JPanel();

        JButton btnRegistrar = new JButton("Registrar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

        btnRegistrar.addActionListener(e -> {
            if (editingRow == -1) {
                model.addRow(new Object[]{
                    textNombre.getText(),
                    textApellido.getText(),
                    textDni.getText(),
                    textSede.getText(),
                    textHorario.getText(),
                    textCurso.getText(),
                    textCosto.getText(),
                    textFecha.getText(),
                    textApoderado.getText()
                });
            } else {
                model.setValueAt(textNombre.getText(), editingRow, 0);
                model.setValueAt(textApellido.getText(), editingRow, 1);
                model.setValueAt(textDni.getText(), editingRow, 2);
                model.setValueAt(textSede.getText(), editingRow, 3);
                model.setValueAt(textHorario.getText(), editingRow, 4);
                model.setValueAt(textCurso.getText(), editingRow, 5);
                model.setValueAt(textCosto.getText(), editingRow, 6);
                model.setValueAt(textFecha.getText(), editingRow, 7);
                model.setValueAt(textApoderado.getText(), editingRow, 8);
                editingRow = -1;
                btnRegistrar.setText("Registrar");
            }
            limpiarCampos();
        });

        btnEditar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                editingRow = selectedRow;
                textNombre.setText((String) model.getValueAt(selectedRow, 0));
                textApellido.setText((String) model.getValueAt(selectedRow, 1));
                textDni.setText((String) model.getValueAt(selectedRow, 2));
                textSede.setText((String) model.getValueAt(selectedRow, 3));
                textHorario.setText((String) model.getValueAt(selectedRow, 4));
                textCurso.setText((String) model.getValueAt(selectedRow, 5));
                textCosto.setText((String) model.getValueAt(selectedRow, 6));
                textFecha.setText((String) model.getValueAt(selectedRow, 7));
                textApoderado.setText((String) model.getValueAt(selectedRow, 8));
                btnRegistrar.setText("Actualizar");
            }
        });

        btnEliminar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
                editingRow = -1;
                btnRegistrar.setText("Registrar");
                limpiarCampos();
            }
        });

        panelBotones.add(btnRegistrar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Roboto Medium", Font.BOLD, 15));
        return label;
    }

    private void cargarDatos() {
        textNombre.setText(BaseDeDatos.nombre);
        textApellido.setText(BaseDeDatos.apellidos);
        textDni.setText(BaseDeDatos.dni);
        textSede.setText(BaseDeDatos.sede);
        textHorario.setText(BaseDeDatos.horario);
        textCurso.setText(BaseDeDatos.curso);
        textCosto.setText(BaseDeDatos.costo);
        textFecha.setText(BaseDeDatos.fecha);
        textApoderado.setText(BaseDeDatos.nomApoderado);
    }

    private void limpiarCampos() {
        textNombre.setText("");
        textApellido.setText("");
        textDni.setText("");
        textSede.setText("");
        textHorario.setText("");
        textCurso.setText("");
        textCosto.setText("");
        textFecha.setText("");
        textApoderado.setText("");
    }
}
