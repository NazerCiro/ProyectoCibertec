
package estructura;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Inicio frame = new Inicio();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Inicio() {
        setTitle("Sciencia - Sistema de Gestion de Matricula");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Left panel with vertical layout
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(139, 0, 0));
        leftPanel.setPreferredSize(new Dimension(205, 0));
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        // Logo panel
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.WHITE);
        logoPanel.setMaximumSize(new Dimension(205, 112));
        logoPanel.setLayout(new BoxLayout(logoPanel, BoxLayout.Y_AXIS));
        JLabel logo = new JLabel(new ImageIcon(Inicio.class.getResource("/Imagenes/LOGO_REAL.png")));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel lblNewLabel_1 = new JLabel("Sciencia ");
        lblNewLabel_1.setFont(new Font("Roboto Condensed Medium", Font.PLAIN, 20));
        lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        logoPanel.add(Box.createVerticalStrut(10));
        logoPanel.add(logo);
        logoPanel.add(Box.createVerticalStrut(10));
        logoPanel.add(lblNewLabel_1);
        leftPanel.add(logoPanel);
        leftPanel.add(Box.createVerticalStrut(20));

        // Menu panels
        leftPanel.add(createMenuPanel("  LOGIN", 20));
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(createMenuPanel("  MATRICULA", 20));
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(createMenuPanel("REGRISTRO", 20));
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(createMenuPanel("MANTENIMIENTO", 16));
        leftPanel.add(Box.createVerticalGlue());

        getContentPane().add(leftPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(new Color(248, 248, 255));

        // Right panel (panel2)
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(139, 0, 0));
        panel2.setPreferredSize(new Dimension(230, 0));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(new EmptyBorder(20, 0, 20, 0)); // Padding for the whole right panel

        // Subpanel: MATRICULA ABIERTA (panel3)
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(63, 63, 63));
        panel3.setMaximumSize(new Dimension(210, 66));
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setBorder(new EmptyBorder(20, 0, 20, 0)); // Padding for panel3

        JLabel lblNewLabel_2 = new JLabel("MATRICULA   ABIERTA");
        lblNewLabel_2.setForeground(new Color(215, 215, 215));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel3.add(Box.createVerticalStrut(100));
        panel3.add(lblNewLabel_2);
        panel3.add(Box.createVerticalStrut(100));
        panel2.add(panel3);

        // Subpanel: REGISTRESE AHORA (panel4)
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(31, 31, 31));
        panel4.setMaximumSize(new Dimension(200, 83));
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.setBorder(new EmptyBorder(20, 0, 20, 0)); // Padding for panel4

        JLabel lblNewLabel_3 = new JLabel("REGISTRESE");
        lblNewLabel_3.setForeground(new Color(192, 192, 192));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel lblNewLabel_4 = new JLabel("AHORA");
        lblNewLabel_4.setForeground(new Color(192, 192, 192));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel4.add(Box.createVerticalStrut(30));
        panel4.add(lblNewLabel_3);
        panel4.add(Box.createVerticalStrut(5));
        panel4.add(lblNewLabel_4);
        panel4.add(Box.createVerticalStrut(30));
        panel2.add(panel4);

        panel2.add(Box.createVerticalGlue());

        JLabel lblNewLabel_5 = new JLabel("INSCRIBANSE");
        lblNewLabel_5.setForeground(new Color(192, 192, 192));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_5.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel2.add(lblNewLabel_5);

        panel2.add(Box.createVerticalGlue());

        JLabel lblNewLabel_6 = new JLabel("CONTACTANOS");
        lblNewLabel_6.setForeground(new Color(192, 192, 192));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel2.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("(+51) 927-568-132");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_7.setForeground(new Color(192, 192, 192));
        lblNewLabel_7.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel2.add(lblNewLabel_7);

        centerPanel.add(panel2, BorderLayout.EAST);

        getContentPane().add(centerPanel, BorderLayout.CENTER);
    }

    private JPanel createMenuPanel(String text, int fontSize) {
        JPanel panel = new JPanel();
        panel.setMaximumSize(new Dimension(147, 42));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(30, 10, 30, 10)); // Add padding
        JLabel label = new JLabel(text);
        label.setFont(new Font("Roboto SemiCondensed Medium", Font.PLAIN, fontSize));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalGlue());
        panel.add(label);
        panel.add(Box.createVerticalGlue());
        return panel;
    }
}

 
