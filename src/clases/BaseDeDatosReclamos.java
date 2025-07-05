// BaseDeDatos.java
package clases;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatosReclamos {
    private static final List<Object[]> reclamos = new ArrayList<>();

    public static void agregarReclamo(Object[] reclamo) {
        reclamos.add(reclamo);
    }

    public static List<Object[]> obtenerReclamos() {
        return reclamos;
    }
}
