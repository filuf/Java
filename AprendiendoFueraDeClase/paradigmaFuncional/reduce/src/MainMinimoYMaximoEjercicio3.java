import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MainMinimoYMaximoEjercicio3 {
    public static void main(String[] args) {
        ArrayList<Productos> prodList = new ArrayList<>(List.of(
                new Productos("Alcachofas",5.00),
                new Productos("Sandia",3.50),
                new Productos("Manzana",2.10)
        ));

        //maneras imperativas
        //1
        double minimo=prodList.get(0).getPrecio(), maximo=prodList.get(0).getPrecio();

        for (Productos productoN : prodList){
            Double precio = productoN.getPrecio();
            if (precio == null) continue;
            if (minimo > precio){
                minimo = precio;
                continue; //salta la siguiente comprobación
            }
            if (maximo < precio) maximo = precio;
        }
        System.out.println("minimo: "+minimo+"\nmaximo: "+maximo);

        //2
        Double minimo2=prodList.get(0).getPrecio(), maximo2=prodList.get(0).getPrecio();

        for (Productos productoN : prodList){
            Double precio = productoN.getPrecio();
            if (precio == null) continue;
            minimo2 = Double.min(minimo2,precio);
            maximo2 = Double.max(maximo2,precio);
        }
        System.out.println("minimo: "+minimo2+"\nmaximo: "+maximo2);

        //maneras funcionales
        //1
        Optional<Double> minimo3 = prodList.stream()
                .map(Productos::getPrecio)
                .filter(Objects::nonNull)
                .reduce(Double::min);
        //devuelve un Optional porque el valor puede o no estar, se hace un filtrado de nulos
        System.out.println("minimo: "+minimo3.get());

        //2 también podemos mapear a Double para obtener funciones especificas
        prodList.stream()
                .mapToDouble(Productos::getPrecio)
                .max()
                .ifPresent(max -> System.out.println("minimo: "+max));
    }
}
