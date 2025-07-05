package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MANTENIMIENTO extends JFrame {
    private static final long serialVersionUID = 1L;

    public MANTENIMIENTO() {
        setTitle("Libro de Reclamaciones - Reporte de Errores");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(40, 40, 40));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("Libro de Reclamaciones");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Roboto", Font.BOLD, 22));
        title.setForeground(new Color(220, 60, 60));
        mainPanel.add(title);

        mainPanel.add(Box.createVerticalStrut(20));

        JTextField txtNombre = createField(mainPanel, "Nombre completo:");
        JTextField txtCorreo = createField(mainPanel, "Correo electrónico:");
        JTextField txtTelefono = createField(mainPanel, "Teléfono:");


        txtTelefono.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c) || txtTelefono.getText().length() >= 9) {
                    e.consume();
                }
            }
        });

        JTextArea txtDescripcion = new JTextArea(5, 20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBackground(new Color(60, 60, 60));
        txtDescripcion.setForeground(Color.WHITE);
        txtDescripcion.setFont(new Font("Roboto", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(txtDescripcion);
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblDesc = new JLabel("Descripción del problema:");
        lblDesc.setForeground(Color.WHITE);
        lblDesc.setFont(new Font("Roboto", Font.BOLD, 15));
        lblDesc.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblDesc);
        mainPanel.add(scroll);

        mainPanel.add(Box.createVerticalStrut(20));

        JButton btnEnviar = new JButton("Enviar Reclamo");
        btnEnviar.setBackground(new Color(139, 0, 0));
        btnEnviar.setForeground(Color.WHITE);
        btnEnviar.setFont(new Font("Roboto", Font.BOLD, 15));
        btnEnviar.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnEnviar.addActionListener(e -> {
            String telefono = txtTelefono.getText();

            if (txtNombre.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
                telefono.isEmpty() || txtDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (telefono.length() != 9) {
                JOptionPane.showMessageDialog(this, "El teléfono debe tener exactamente 9 números.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Object[] reclamo = new Object[]{
                    txtNombre.getText(),
                    txtCorreo.getText(),
                    telefono,
                    txtDescripcion.getText()
                };
                BaseDeDatosReclamos.agregarReclamo(reclamo);
                BaseDeDatosReporte.guardarReporte(txtNombre.getText(), txtCorreo.getText(), txtTelefono.getText(), txtDescripcion.getText());
                JOptionPane.showMessageDialog(this, "¡Reclamo enviado!\nGracias por ayudarnos a mejorar.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtDescripcion.setText("");
            }
        });

        mainPanel.add(btnEnviar);

        setContentPane(mainPanel);
     
    }

    private JTextField createField(JPanel panel, String label) {
        JLabel lbl = new JLabel(label);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Roboto", Font.BOLD, 15));
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lbl);

        JTextField field = new JTextField();
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        field.setBackground(new Color(60, 60, 60));
        field.setForeground(Color.WHITE);
        field.setFont(new Font("Roboto", Font.PLAIN, 14));
        panel.add(field);

        panel.add(Box.createVerticalStrut(10));
        return field;
    }
}
