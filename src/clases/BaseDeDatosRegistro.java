package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BaseDeDatosRegistro {
    public static void guardarRegistro(String nombre, String apellidos, String dni, String sede, String horario, String curso, String costo, String fecha, String nomApoderado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("REGISTRO.txt", true))) {
            writer.write("Nombre: " + nombre);
            writer.newLine();
            writer.write("Apellidos: " + apellidos);
            writer.newLine();
            writer.write("DNI: " + dni);
            writer.newLine();
            writer.write("Sede: " + sede);
            writer.newLine();
            writer.write("Horario: " + horario);
            writer.newLine();
            writer.write("Curso: " + curso);
            writer.newLine();
            writer.write("Costo: " + costo);
            writer.newLine();
            writer.write("Fecha: " + fecha);
            writer.newLine();
            writer.write("Nombre del Apoderado: " + nomApoderado);
            writer.newLine();
            writer.write("-----------------------------------------------------");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el registro: " + e.getMessage());
        }
    }
}