package estructura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Login extends JFrame {
	

	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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

    public Login() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 500);
    setLocationRelativeTo(null);

    // Usa BorderLayout en el content pane
    getContentPane().setLayout(new BorderLayout());

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(139, 0, 0));
    leftPanel.setPreferredSize(new Dimension(205, 0));
    leftPanel.setLayout(null);

    JPanel logoPanel = new JPanel();
    logoPanel.setBounds(0, 0, 205, 112);
    logoPanel.setBackground(Color.WHITE);
    logoPanel.setPreferredSize(new Dimension(205, 112));
    logoPanel.setLayout(null);
    JLabel logo = new JLabel(new ImageIcon(Login.class.getResource("/Imagenes/LOGO_REAL.png")));
    logo.setBounds(70, 11, 50, 63);
    logoPanel.add(logo);
    leftPanel.add(logoPanel);
    
    JLabel lblNewLabel_1 = new JLabel("Sciencia ");
    lblNewLabel_1.setFont(new Font("Roboto Condensed Medium", Font.PLAIN, 20));
    lblNewLabel_1.setBounds(65, 85, 81, 16);
    logoPanel.add(lblNewLabel_1);

    JPanel centerPanel = new JPanel();
    centerPanel.setBackground(new Color(248, 248, 255));
    centerPanel.setLayout(null);

    // Añade los paneles al BorderLayout
    getContentPane().add(leftPanel, BorderLayout.WEST);
    
    JPanel panel = new JPanel();
    panel.setBounds(27, 141, 147, 42);
    leftPanel.add(panel);
    panel.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("  LOGIN");
    lblNewLabel.setFont(new Font("Roboto SemiCondensed Medium", Font.PLAIN, 20));
    lblNewLabel.setBounds(31, 11, 69, 20);
    panel.add(lblNewLabel);
    
    JPanel panel_1 = new JPanel();
    panel_1.setBounds(27, 213, 147, 42);
    leftPanel.add(panel_1);
    panel_1.setLayout(null);
    
    JLabel lblMatricula = new JLabel("  MATRICULA");
    lblMatricula.setFont(new Font("Roboto SemiCondensed Medium", Font.PLAIN, 20));
    lblMatricula.setBounds(10, 11, 127, 20);
    panel_1.add(lblMatricula);
    
    JPanel panel_1_1 = new JPanel();
    panel_1_1.setBounds(27, 293, 147, 42);
    leftPanel.add(panel_1_1);
    panel_1_1.setLayout(null);
    
    JLabel lblRegristro = new JLabel("REGRISTRO");
    lblRegristro.setFont(new Font("Roboto SemiCondensed Medium", Font.PLAIN, 20));
    lblRegristro.setBounds(23, 11, 100, 20);
    panel_1_1.add(lblRegristro);
    
    JPanel panel_1_1_1 = new JPanel();
    panel_1_1_1.setLayout(null);
    panel_1_1_1.setBounds(27, 369, 147, 42);
    leftPanel.add(panel_1_1_1);
    
    JLabel lblMantenimiento = new JLabel("MANTENIMIENTO");
    lblMantenimiento.setFont(new Font("Roboto SemiCondensed Medium", Font.PLAIN, 16));
    lblMantenimiento.setBounds(10, 11, 127, 20);
    panel_1_1_1.add(lblMantenimiento);
    getContentPane().add(centerPanel, BorderLayout.CENTER);
    
    JPanel panel_2 = new JPanel();
    panel_2.setBackground(new Color(139, 0, 0));
    panel_2.setBounds(383, 0, 196, 461);
    centerPanel.add(panel_2);
    panel_2.setLayout(null);
    
    JPanel panel_3 = new JPanel();
    panel_3.setBackground(new Color(63, 63, 63));
    panel_3.setBounds(0, 0, 196, 166);
    panel_2.add(panel_3);
    panel_3.setLayout(null);
    
    JLabel lblNewLabel_2 = new JLabel("MATRICULA   ABIERTA");
    lblNewLabel_2.setForeground(new Color(215, 215, 215));
    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblNewLabel_2.setBounds(10, 45, 176, 63);
    panel_3.add(lblNewLabel_2);
    
    JPanel panel_4 = new JPanel();
    panel_4.setBackground(new Color(31, 31, 31));
    panel_4.setBounds(0, 164, 196, 83);
    panel_2.add(panel_4);
    panel_4.setLayout(null);
    
    JLabel lblNewLabel_3 = new JLabel("REGISTRESE");
    lblNewLabel_3.setForeground(new Color(192, 192, 192));
    lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblNewLabel_3.setBounds(47, 11, 115, 24);
    panel_4.add(lblNewLabel_3);
    
    JLabel lblNewLabel_4 = new JLabel("AHORA");
    lblNewLabel_4.setForeground(new Color(192, 192, 192));
    lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblNewLabel_4.setBounds(67, 46, 69, 14);
    panel_4.add(lblNewLabel_4);
    
    JLabel lblNewLabel_5 = new JLabel("INSCRIBANSE");
    lblNewLabel_5.setForeground(new Color(192, 192, 192));
    lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
    lblNewLabel_5.setBounds(29, 283, 157, 18);
    panel_2.add(lblNewLabel_5);
    
    JLabel lblNewLabel_6 = new JLabel("CONTACTANOS");
    lblNewLabel_6.setForeground(new Color(192, 192, 192));
    lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblNewLabel_6.setBounds(40, 397, 134, 18);
    panel_2.add(lblNewLabel_6);
    
    JLabel lblNewLabel_7 = new JLabel("(+51) 927-568-132");
    lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblNewLabel_7.setForeground(new Color(192, 192, 192));
    lblNewLabel_7.setBounds(40, 436, 134, 14);
    panel_2.add(lblNewLabel_7);
}   
    }

