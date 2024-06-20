import java.util.ArrayList;
import java.util.List;

public class MainMultiplicarTodosLosValoresEjercicio2 {
    public static void main(String[] args) {
        List<Integer> numerosList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        //forma imperativa
        int numeroFinal = 1; //debe ser 1 ya que multiplicar por 0 es 0

        for (int aMultiplicar : numerosList) {
            numeroFinal *= aMultiplicar;
        }
        System.out.println("[+] Resultado final de la multiplicación" + numeroFinal);

        //forma funcional
        int numeroFinal2 = numerosList.stream()
                .reduce(1, (integer, integer2) -> integer * integer2);
        //en este caso debemos inicializar la identidad a 1
        System.out.println("[+] Resultado final de la multiplicación" + numeroFinal2);

    }
}
