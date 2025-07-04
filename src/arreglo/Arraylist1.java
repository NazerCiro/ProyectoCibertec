
package arreglo;

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
		// Implementar la lógica para cargar estudiantes desde un archivo si es
		// necesario
	}
}
