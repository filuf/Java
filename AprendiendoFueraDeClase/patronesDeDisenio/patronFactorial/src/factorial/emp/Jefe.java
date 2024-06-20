package factorial.emp;



class Jefe extends Empleado {
    public Jefe(String idEmpleado, String nombreEmpleado) {
        super(idEmpleado, nombreEmpleado);
    }

    Jefe() {
        super("","");
    }

    @Override
    public String getTipoEmpleado() {
        return "Soy un jefe";
    }
}
