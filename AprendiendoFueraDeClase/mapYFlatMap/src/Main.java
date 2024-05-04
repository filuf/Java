import claseEmpleadosYTareas.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //MAP (se usa para tratar datos en el recorrido de una lista)

        //creamos unos nombres de prueba
        String[] arrayNombres = {"pedro","paco","peDRo","Marta"};

        //convertimos a lista
        List<String> listaNombres = Arrays.asList(arrayNombres);

        //uso de map para tratar los datos en cada recorrido
        ArrayList <String> listaNombresSinRepetir = listaNombres.stream()
                .map(String::toLowerCase) //convertimos a minúsculas
                .distinct()//eliminamos dupliacados
                .map(nombre -> Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1)) //convertimos la inicial a mayúscula y la concatenamos
                .collect(Collectors.toCollection(ArrayList::new)); //recolectamos el resultado en un Arraylist


        // FLAT MAP (se usa para aplanar listas de listas)

        //array de 3 empleados
        final Empleados[] ARRAY_EMP = {
                new Empleados("Pedro"),
                new Empleados("Juan"),
                new Empleados("Jaime")
        };

        //3 tareas para Pedro
        ARRAY_EMP[0].getListaDeTareas().addAll(Arrays.asList(
                new Tareas("Imprimir", 1),
                new Tareas("Informes",1),
                new Tareas("Visita",1)
        ));

        //2 tareas para Juan
        ARRAY_EMP[1].getListaDeTareas().addAll(Arrays.asList(
                new Tareas("Depurar", 4),
                new Tareas("Pruebas",2)
        ));

        //4 tareas para Jaime
        ARRAY_EMP[2].getListaDeTareas().addAll(Arrays.asList(
                new Tareas("Revisar la red", 1),
                new Tareas("Resolver tickets de soporte",3),
                new Tareas("Hablar con cliente",2),
                new Tareas("Tomarse un café",1)
        ));

        //Creamos una lista con los 3 empleados
        ArrayList<Empleados> listaEmpleados = new ArrayList<>(Arrays.asList(ARRAY_EMP));

        //filtrar por empleados y sus tareas asociadas que ocupen 2 horas o más
        listaEmpleados.stream()
                .peek(emp -> System.out.println("\n\nTareas del empleado "+emp.getNOMBRE_EMPLEADO()+" con una duración superior o igual a 2 horas\n")) //muestra el empleado sobre el que se operará
                .flatMap(emp -> emp.getListaDeTareas().stream()) //recorre su lista interna de tareas
                .filter(tarea -> tarea.getDURACION_HORAS() >= 2) //filtra solo las que duren 2 o más horas
                .peek(tarea -> System.out.println("\t-\tTarea: "+tarea.getNOMBRE_TAREA()+"\n\t\tDuración: "+tarea.getDURACION_HORAS()+"h")) //muestra el nombre de esa tarea y su duración en horas
                .forEach(i -> {}); //no hace nada pero permite que se recorra la lista mostrando los mensajes anteriores y consumiendo la operación

        //este filtro tiene un incoveniente, se muestra al empleado Pedro aunque este no tenga ninguna tarea que cumpla el filtro

        System.out.println("\n-----Ahora con filtro previo de empleados-----");

        listaEmpleados.stream()
                .filter(emp -> emp.getListaDeTareas().stream().anyMatch(tarea -> tarea.getDURACION_HORAS() >= 2)) //con este filtro previo, se deberá encontrar una tarea que cumpla la condición, antes de mostrar al empleado
                .peek(emp -> System.out.println("\nTareas del empleado "+emp.getNOMBRE_EMPLEADO()+" que cumplen el filtro"))
                .flatMap(emp -> emp.getListaDeTareas().stream())
                .filter(tar -> tar.getDURACION_HORAS() >= 2)
                .peek(tar -> System.out.println("\tTarea: "+tar.getNOMBRE_TAREA()+" - Duración "+tar.getDURACION_HORAS()+"h"))
                .forEach(i -> {});

    }
}
