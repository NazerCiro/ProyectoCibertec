package clases;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class LOGIN extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JPasswordField txtContraseña;
    private JTextField txtUsuario;

	public LOGIN() {
        setTitle("LOGIN");
        setSize(866, 553);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel BASE = new JPanel();
        BASE.setBackground(new Color(192, 192, 192));
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
        lblContraseña.setBounds(38, 376, 105, 14);
        BASE.add(lblContraseña);
        
        txtContraseña = new JPasswordField();
        txtContraseña.setToolTipText("");
        txtContraseña.setBounds(38, 413, 243, 20);
        BASE.add(txtContraseña);
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(38, 327, 243, 20);
        BASE.add(txtUsuario);
        txtUsuario.setColumns(10);
        
        
        JPanel btnButton = new JPanel();
        btnButton.addMouseListener(new MouseAdapter() {@Override
        	public void mouseEntered(MouseEvent e) {
        	btnButton.setBackground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnButton.setBackground(new Color(120, 18, 12));
        	}
        	
            public void mouseClicked(MouseEvent e) {
            	javax.swing.JOptionPane.showMessageDialog(null, "Iniciando sesión...");
                 String usuario = txtUsuario.getText();
                 String contraseña = new String(txtContraseña.getPassword());
                 javax.swing.JOptionPane.showMessageDialog(null, "Usuario: " + usuario + "\nContraseña: " + contraseña);
               }
            });
        
        btnButton.setBackground(new Color(120, 18, 12));
        btnButton.setBounds(38, 462, 132, 41);
        BASE.add(btnButton);
        btnButton.setLayout(null);
        
        JLabel lblIngresar = new JLabel("INGRESAR");
        lblIngresar.setFont(new Font("Roboto Condensed Medium", Font.BOLD, 15));
        lblIngresar.setForeground(new Color(255, 255, 255));
        lblIngresar.setBounds(33, 11, 68, 22);
        btnButton.add(lblIngresar);
    }
}
