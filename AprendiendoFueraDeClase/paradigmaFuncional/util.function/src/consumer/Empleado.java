package consumer;

import java.time.LocalDate;

public class Empleado {
    private final String idEmpleado;
    private static int contadorEmpleados;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Empleado(String nombre, String apellido1, String apellido2) {
        this.idEmpleado = generarIdEmpleado();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    private String generarIdEmpleado() {
        return "EMP" + String.format("%04d", contadorEmpleados);
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
