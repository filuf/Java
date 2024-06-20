package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> miListaPersonas = new ArrayList<>(
                List.of(
                        "Pedro","Juan","Paco",
                        "Jaime","Agustín","Adrian"
                ));

        //creación y uso de consumer sobre una lista
        Consumer<String> consumerPersonalizado = s -> System.out.print(s +" ");

        miListaPersonas.forEach(consumerPersonalizado);

        System.out.println("\n******************************");

        List<Empleado> listaEmpleados = new ArrayList<>();
        for (String nombre : miListaPersonas) {
            listaEmpleados.add(new Empleado(
                    nombre, "ejemplo", "example"
            ));
        }

        //uso de llaves (recomendado evitarlo siempre que se pueda)
        listaEmpleados.forEach(s -> {
                    System.out.println(s.getNombre() + " "
                            + s.getApellido1() + " "
                            + s.getApellido2());
                });

        System.out.println("***********************************");

        //combinando 2 Consumer con "andThen"
        Consumer<String> formateo1Mayus = s -> System.out.print(
                Character.toUpperCase(s.charAt(0)));

        Consumer<String> formateoRestoAMinuscula = s -> System.out.println(
                s.substring(1).toLowerCase());

        Consumer<String> combinado = formateo1Mayus.andThen(formateoRestoAMinuscula);

        listaEmpleados.forEach(
                s -> combinado.accept(s.getNombre()));

        System.out.println("*****************************");
        //hay formas más eficientes de hacer esta tarea con funciones como map
        listaEmpleados.stream()
                .map(emp -> Character.toUpperCase(emp.getNombre().charAt(0))
                        + emp.getNombre().toLowerCase().substring(1))
                .forEach(System.out::println);
    }
}
