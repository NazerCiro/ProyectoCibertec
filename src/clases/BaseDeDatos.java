package clases;

public class BaseDeDatos {
    public static String nombre = "";
    public static String apellidos = "";
    public static String dni = "";
    public static String sede = "";
    public static String horario = "";
    public static String curso = "";
    public static String costo = "";
    public static String fecha = "";
    public static String nomApoderado = "";

    public static void guardarDatos(String n, String a, String d, String s, String h, String c, String co, String f, String na) {
        nombre = n;
        apellidos = a;
        dni = d;
        sede = s;
        horario = h;
        curso = c;
        costo = co;
        fecha = f;
        nomApoderado = na;
    }
}
