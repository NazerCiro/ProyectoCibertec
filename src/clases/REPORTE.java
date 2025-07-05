
package clases;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class REPORTE extends JFrame {
    private static final long serialVersionUID = 1L;

    public REPORTE() {
        setTitle("Reporte de Reclamos");
        setSize(700, 400);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(40, 40, 40));

        JLabel title = new JLabel("Reporte de Reclamos");
        title.setFont(new Font("Roboto", Font.BOLD, 22));
        title.setForeground(new Color(139, 0, 0));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(title, BorderLayout.NORTH);

        String[] columnas = {"Nombre", "Correo", "Teléfono", "Descripción"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);

        for (Object[] reclamo : BaseDeDatosReclamos.obtenerReclamos()) {
            model.addRow(reclamo);
        }

        JTable table = new JTable(model);
        table.setBackground(new Color(60, 60, 60));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Roboto", Font.PLAIN, 14));
        table.getTableHeader().setBackground(new Color(139, 0, 0));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 15));
        table.setRowHeight(28);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.getViewport().setBackground(new Color(40, 40, 40));
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        setContentPane(mainPanel);
    }
}
