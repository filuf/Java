package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //<tipo input, tipo resultado>
        Function<Empleado, String> fusionarYFormatearCadenas = s -> {
            return nombreApellidoFormat(s.getNombre())+" "
                    +nombreApellidoFormat(s.getApellido1())+" "
                    +nombreApellidoFormat(s.getApellido2());
        };
        List<Empleado> empleadoList = new ArrayList<>();

        empleadoList.add(new Empleado("jUan","Martínez","péreZ"));
        empleadoList.add(new Empleado("jUan","Martínez","péreZ"));
        empleadoList.add(new Empleado("jUan","Martínez","péreZ"));
        empleadoList.add(new Empleado("jUan","Martínez","péreZ"));
        empleadoList.add(new Empleado("jUan","Martínez","péreZ"));

        empleadoList.stream()
                .map(fusionarYFormatearCadenas)
                .forEach(System.out::println);
    }
    private static String nombreApellidoFormat (String cadena) {
        return Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1).toLowerCase();
    }
}
