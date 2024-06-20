package factorial.emp;

class Currito extends Empleado {
    public Currito(String idEmpleado, String nombreEmpleado) {
        super(idEmpleado, nombreEmpleado);
    }

    Currito() {
        super("","");
    }

    @Override
    public String getTipoEmpleado() {
        return "Soy un currito";
    }
}
