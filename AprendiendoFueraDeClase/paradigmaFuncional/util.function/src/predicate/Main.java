package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //los predicate son interfaces funcionales que devuelven un booleano
        //estos contienen un método abstracto "test" que evalua una condición.

        Predicate<String> tiene5Char = s -> s.length() == 5;

        String cadena5Chars = "12345";

        System.out.println("¿La cadena tiene 5 chars? "+tiene5Char.test(cadena5Chars));

        String cadena3Chars = "123";

        System.out.println("¿La cadena tiene 5 chars? "+tiene5Char.test(cadena3Chars));

        //los predicate tienen un método "negate" para realizar la condición inversa

        System.out.println("¿La cadena NO tiene 5 chars? "+tiene5Char.negate().test(cadena3Chars));

        //también a partir de java 11, cuentan con un método estático llamano not que tiene el mismo efecto
        //pero sin la necesidad de tener un Predicate instanciado

        List<String> miLista = new ArrayList<>(
                List.of("1234","hola","5char","ejemplo")
        );

        miLista.stream()
                .filter(Predicate.not(cadena -> cadena.startsWith("1"))) //Usamos un "Predicate" nuevo, construido en el propio filtro
                .forEach(cad -> System.out.print(cad+" "));

        System.out.println();

        //también tenemos el método "and" par unir condiciones

        Predicate<String> empiezaPorNumero = s -> Character.isDigit(s.charAt(0));

        Predicate<String> tiene5CharsYEmpiezaPorNumero = tiene5Char.and(empiezaPorNumero);

        //No podemos unir predicados de distintos tipos

        Predicate<Character> esDigito = Character::isDigit;

        // ERROR EN COMPILACIÓN:    Predicate<String> tiene5CharsYesDigito = tiene5Char.and(esDigito);

        //También podemos evaluar que se cumpla alguna condición con "or"

        miLista.removeIf(empiezaPorNumero.or(tiene5Char));
        //el método removeIf, borra los elementos que devuelven true en la condición

        System.out.println(miLista);

        //El último método de Predicate es "isEqual" que permite filtrar por objetos que sean iguales
        //La propia clase tiene que tener el método "equals" definido

        Predicate<String> esJaime = Predicate.isEqual("Jaime");

        List<String> nombres = List.of("Jaime","Jacinto","Mario","Carlos","Eduardo","Jaime","Araceli");

        System.out.print("En esta lista hay ");
        System.out.print(nombres.stream()
                .filter(esJaime)
                .count());
        System.out.println(" Jaimes");

        //a simple vista carece de utilidad, ya que podemos conseguir el mismo resultado con el método equals de String

        System.out.println("En esta lista hay "+nombres.stream()
                .filter(nombre -> nombre.equals("Jaime"))
                .count()+" Jaimes");

        //la cosa cambia cuando definimos nuestros propios métodos

        List<String> nuevaLista = filtrarLista(nombres, Predicate.isEqual("Jaime"));

        System.out.println(nuevaLista);
    }
    public static <T> List<T> filtrarLista(List<T> lista, Predicate<T> predicado) {
        return lista.stream()
                .filter(predicado)
                .collect(Collectors.toList());
    }
}
