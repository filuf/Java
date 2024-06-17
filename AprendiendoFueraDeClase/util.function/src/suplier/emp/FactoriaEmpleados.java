package suplier.emp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoriaEmpleados {

    private final static Map<String, Supplier<Empleado>> mapaTipos = new HashMap<>();

    static {
        //sin y con método por referencia
        mapaTipos.put("currito", () -> new Currito());
        mapaTipos.put("jefe", Jefe::new);
    }

    public static Optional<Empleado> getTipo (String tipoEmpleado) {

        return Optional.ofNullable(mapaTipos.get(
                tipoEmpleado.toLowerCase()))
                .map(Supplier::get);
    }
}
