import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayEnteros = {33,22,45,10,5};
        Long[] arrayLongs = {33L,22L,45L,10L,70L};
        Character[] arrayCaracteres = {'j','a','q','i','o'};

        //nos olvidamos de la existencia de Arrays.sort();

        System.out.println("[+] Array de enteros ordenado:");
        ClaseBurbujaNumeros.ordenarNumeros(arrayEnteros);
        Arrays.stream(arrayEnteros).forEach(integer -> System.out.print(integer+" "));

        System.out.println("\n\n[+] Array de largos ordenado:");
        ClaseBurbujaNumeros.ordenarNumeros(arrayLongs);
        Arrays.stream(arrayLongs).forEach(largo -> System.out.print(largo+" "));

        System.out.println("\n\n[+] Array de chars ordenado");
        ClaseBurbujaNumeros.ordenarNumeros(arrayCaracteres);
        Arrays.stream(arrayCaracteres).forEach(caracter -> System.out.print(caracter+" "));




    }
}
