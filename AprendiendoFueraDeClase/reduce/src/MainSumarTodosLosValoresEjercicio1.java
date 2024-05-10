import java.util.List;

public class MainSumarTodosLosValoresEjercicio1 {
    public static void main(String[] args) {
        List<Integer> numerosList = List.of(1, 2, 3, 4, 5);

        // de forma imperativa
        int resultadoFinal = 0;
        for (int numero : numerosList) {
            resultadoFinal += numero;
        }
        System.out.println("[+] El resultado es : " + resultadoFinal);

        // de forma funcional
        int resultadoFinal2 = numerosList.stream()
                .reduce(0, (integer1, integer2) -> integer1 + integer2);
        //reduce es una operación terminal, en este caso defines un valor de inicio y la interfaz funcional binaryOperator

        System.out.println("[+] El resultado es : " + resultadoFinal2);

        //con metodos por referencia
        int resultadoFinal3 = numerosList.stream()
                .reduce(0, Integer::sum);
        //de esta manera le damos un valor inicial y llamamos al método sum de Integer
    }
}