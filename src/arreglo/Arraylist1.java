
package arreglo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// Clase Estudiante
class Estudiante {
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(int codigo, String nombre, double nota1, double nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}

// Clase Arraylist1
public class Arraylist1 {
    private ArrayList<Estudiante> list;

    public Arraylist1() {
        list = new ArrayList<>();
        cargarEstudiantes();
    }

    public void adicionar(Estudiante x) {
        list.add(x);
        grabarEstudiantes();
    }

    public int tamanio() {
        return list.size();
    }

    public Estudiante obtener(int i) {
        return list.get(i);
    }

    public Estudiante buscar(int codigo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigo() == codigo) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Estudiante x) {
        list.remove(x);
        grabarEstudiantes();
    }

    public void actualizarCambios() {
        grabarEstudiantes();
    }

    private void grabarEstudiantes() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("estudiantes.txt"));
            for (Estudiante x : list) {
                String linea = x.getCodigo() + ";" + x.getNombre() + ";" + x.getNota1() + ";" + x.getNota2();
                pw.println(linea);
            }
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo grabar estudiantes");
        }
    }

    private void cargarEstudiantes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("estudiantes.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] s = linea.split(";");
                int codigo = Integer.parseInt(s[0]);
                String nombre = s[1];
                double nota1 = Double.parseDouble(s[2]);
                double nota2 = Double.parseDouble(s[3]);
                Estudiante est = new Estudiante(codigo, nombre, nota1, nota2);
                list.add(est);
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar estudiantes");
        }
    }

    public void mostrarEstudiantes() {
        for (int i = 0; i < tamanio(); i++) {
            Estudiante est = obtener(i);
            imprimir("Codigo: " + est.getCodigo() + ", Nombre: " + est.getNombre() + ", Nota1: "
                    + est.getNota1() + ", Nota2: " + est.getNota2());
        }
    }

    private void imprimir(String string) {
        System.out.println(string);
    }

    public void eliminarPorCodigo(int codigo) {
        Estudiante est = buscar(codigo);
        if (est != null) {
            eliminar(est);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
        }
    }
}

