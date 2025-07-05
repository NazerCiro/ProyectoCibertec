package clases;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class REGISTRO extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textNombre, textApellido, textDni, textSede, textHorario, textCurso, textCosto, textFecha, textApoderado;
    private JTable table;
    private DefaultTableModel model;

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

        // Load data from BaseDeDatos
        cargarDatos();

        JPanel panelBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> {
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
        });
        panelBotones.add(btnRegistrar);
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
}

