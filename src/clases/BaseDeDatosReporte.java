package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BaseDeDatosReporte {
    public static void guardarReporte(String nombre, String correo, String telefono, String descripcion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("REPORTE.txt", true))) {
            writer.write("Nombre: " + nombre);
            writer.newLine();
            writer.write("Correo: " + correo);
            writer.newLine();
            writer.write("Teléfono: " + telefono);
            writer.newLine();
            writer.write("Descripción: " + descripcion);
            writer.newLine();
            writer.write("-----------------------------------------------------");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el reporte: " + e.getMessage());
        }
    }
}