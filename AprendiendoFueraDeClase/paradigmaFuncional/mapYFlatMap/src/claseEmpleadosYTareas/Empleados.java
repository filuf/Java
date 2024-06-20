package claseEmpleadosYTareas;

import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private final String NOMBRE_EMPLEADO;
    private List<Tareas> listaDeTareas;

    public Empleados(String NOMBRE_EMPLEADO) {
        this.NOMBRE_EMPLEADO = NOMBRE_EMPLEADO;
        this.listaDeTareas = new ArrayList<>();
    }

    public String getNOMBRE_EMPLEADO() {
        return NOMBRE_EMPLEADO;
    }

    public List<Tareas> getListaDeTareas() {
        return listaDeTareas;
    }
}
