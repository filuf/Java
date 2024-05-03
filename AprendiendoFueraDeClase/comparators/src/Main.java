import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creamos nuestro Comparator en el que definimos el criterio de comparación

        //forma antigua
        Comparator<Productos> comparaUsandoClasesAnonimas = new Comparator<Productos>() {
            @Override
            public int compare(Productos o1, Productos o2) {
                return o1.getPrecio().compareTo(o2.getPrecio());
            }
        };

        //formas funcionales
        Comparator<Productos> comparaPorPreciosUsandoLambda = (p1,p2) -> p1.getPrecio().compareTo(p2.getPrecio());
        Comparator<Productos> comparaPorPreciosUsandoReferencia = Comparator.comparing(Productos::getPrecio);

        List<Productos> listaProductos = new ArrayList<>(List.of(
                new Productos("Cacahuetes", 5.99),
                new Productos("Manzana", 2.99),
                new Productos("Sardinas", 10.95)
        ));

        //ordenamos nuestra lista
        listaProductos.sort(comparaPorPreciosUsandoReferencia);

        //mostramos los productos ordenados por preciode menor a mayor
        listaProductos.forEach(System.out::println);

        //creamos otro comparator pero esta vez de orden inverso
        Comparator<Productos> comparaPorPreciosMayorAMenor = Comparator.comparing(Productos::getPrecio).reversed();

        //ordenamos inversamente nuestra lista
        listaProductos.sort(comparaPorPreciosMayorAMenor);

        //mostramos solo el nombre y los precios
        listaProductos.forEach(p -> System.out.println("Nombre producto - "+p.getNOMBRE_PRODUCTO()
                                                        +"\nPrecio - "+p.getPrecio()));
    }
}
