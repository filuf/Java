import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Productos> listaDeProductos = new ArrayList<>();

        System.out.println("[+] Añadiendo productos:");

        //añadimos productos
        listaDeProductos.add(new Productos("Jamón",5.00));
        listaDeProductos.add(new Productos("Queso",4.50));
        listaDeProductos.add(new Productos("Pan",0.80));
        listaDeProductos.add(new Productos("Ternera",8.00));

        //extraemos el statistic
        DoubleSummaryStatistics estadisticas =
                listaDeProductos.stream()
                        .peek(System.out::println)
                        .collect(Collectors.summarizingDouble(Productos::getPrecio)); //extraemos únicamente el precio


        //funciones
        System.out.println(
                        "\n[+] Precio medio: "+String.format("%.2f",estadisticas.getAverage())+
                        "\n[+] Precio maximo: "+String.format("%.2f",estadisticas.getMax())+
                        "\n[+] Precio mínimo: "+String.format("%.2f",estadisticas.getMin())+
                        "\n[+] Número de productos: "+estadisticas.getCount()+
                        "\n[+] Suma de todos los precios: "+String.format("%.2f",estadisticas.getSum())
        );
    }
}