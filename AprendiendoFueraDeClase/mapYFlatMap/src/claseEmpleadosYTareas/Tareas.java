package claseEmpleadosYTareas;

public class Tareas {
    private final String NOMBRE_TAREA;
    private final int DURACION_HORAS;

    public Tareas(String NOMBRE_TAREA, int DURACION_HORAS) {
        this.NOMBRE_TAREA = NOMBRE_TAREA;
        this.DURACION_HORAS = DURACION_HORAS;
    }

    public String getNOMBRE_TAREA() {
        return NOMBRE_TAREA;
    }

    public int getDURACION_HORAS() {
        return DURACION_HORAS;
    }
}
