import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class takeWhile {
    public static void main(String[] args) {
        // hora - temperatura
        Map<Integer,Integer> temperatura = new HashMap<>();

        //añadimos unos datos de prueba
        temperatura.put(0,15);
        temperatura.put(1,13);
        temperatura.put(2,15);
        temperatura.put(3,16);
        temperatura.put(4,17);
        temperatura.put(5,16);
        temperatura.put(6,17);
        temperatura.put(7,18);
        temperatura.put(8,19);
        temperatura.put(9,20); //debe cortar aquí
        temperatura.put(10,19);
        temperatura.put(11,20);
        temperatura.put(12,21);

        //con los métodos takeWhile y dropWhile podemos extraer cierto conjunto de datos
        //o simplemente descartar la parte inicial de algunos datos que no nos interese trabajar con ellos en este momento

        Map<Integer,Integer> temperaturasHastaQueLlegueA20 = temperatura.entrySet().stream()
                .takeWhile( entrada -> entrada.getValue() < 20) //filtramos hasta que una temperatura no sea menor a 20ª
                .collect(Collectors.toMap( //recolectamos en otro mapa (debemos especificar quien es la clave y valor)
                        entrada -> entrada.getKey(), //con lambda
                        Map.Entry::getValue //con method reference
                ));

        BiConsumer<Integer,Integer> imprimirHoraYTemperatura =
                (k,v) -> System.out.println("hora: "+k+" temperatura "+v+"ª");
        //usamos un biconsumer para poder imprimir el mapa


        temperaturasHastaQueLlegueA20.forEach(imprimirHoraYTemperatura);
    }
}
