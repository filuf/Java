package suplier.emp;

public abstract class Empleado {
    private final String idEmpleado;

    private String nombreEmpleado;

    public Empleado(String idEmpleado, String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public abstract String getTipoEmpleado();
}
