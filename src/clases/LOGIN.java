
package clases;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class LOGIN extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JPasswordField passwordField_1;
    private JTextField textField;

	public LOGIN() {
        setTitle("LOGIN");
        setSize(866, 553);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel BASE = new JPanel();
        BASE.setBackground(new Color(255, 255, 255));
        BASE.setBounds(0, 0, 850, 514);
        getContentPane().add(BASE);
        BASE.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(LOGIN.class.getResource("/Imagenes/Banner_Login.png")));
        lblNewLabel.setBounds(510, 0, 340, 514);
        BASE.add(lblNewLabel);
        
        JPanel PanelSuperior = new JPanel();
        PanelSuperior.setBackground(new Color(255, 255, 255));
        PanelSuperior.setBounds(0, 0, 511, 76);
        BASE.add(PanelSuperior);
        PanelSuperior.setLayout(null);
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setBounds(23, 11, 57, 57);
        PanelSuperior.add(lblLogo);
        lblLogo.setIcon(new ImageIcon(LOGIN.class.getResource("/Imagenes/LOGO_REAL.png")));
        
        JPanel Menu = new JPanel();
        Menu.setBackground(new Color(128, 128, 128));
        Menu.setBounds(0, 76, 511, 67);
        BASE.add(Menu);
        
        JLabel lblITextoIni = new JLabel("INICIAR SESION");
        lblITextoIni.setFont(new Font("Roboto Medium", Font.PLAIN, 25));
        lblITextoIni.setBounds(38, 165, 187, 22);
        BASE.add(lblITextoIni);
        
        JLabel lblUsuario = new JLabel("USUARIO :");
        lblUsuario.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
        lblUsuario.setBounds(38, 283, 85, 14);
        BASE.add(lblUsuario);
        
        JLabel lblContraseña = new JLabel("CONTRASEÑA :");
        lblContraseña.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
        lblContraseña.setBounds(38, 370, 105, 14);
        BASE.add(lblContraseña);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(38, 413, 243, 20);
        BASE.add(passwordField_1);
        
        textField = new JTextField();
        textField.setBounds(38, 327, 243, 20);
        BASE.add(textField);
        textField.setColumns(10);
    }
}
