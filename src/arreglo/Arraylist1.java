package arreglo;

import clases.clasepadre;
import java.util.ArrayList;

public class Arraylist1 {
	//Atributo privado
	private ArrayList<Arraylist1> list;
	//Constructor
	public Arraylist1() {
		list = new ArrayList<Arraylist1>();
		cargarEstudiantes();
	}
	//Operaciones publicas basicas
	public void adicionar(Arraylist1 x) {
		list.add(x);
		grabarEstudiantes();
	}
	public int tamanio() {
		return list.size();
	}
	public Arraylist1 obtener(int i) {
		return list.get(i);
	}

}
