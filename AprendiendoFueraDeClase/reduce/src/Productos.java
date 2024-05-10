public class Productos {
    private final String ID_PRODUCTO;
    private static int contadorProductos = 0;
    private final String NOMBRE_PRODUCTO;
    private Double precio;

    public Productos(String NOMBRE_PRODUCTO, Double precio) {
        ID_PRODUCTO = crearIdProducto();

        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.precio = precio;
    }

    private String crearIdProducto() {
        final String cabecera = "PROD";
        contadorProductos++;
        return cabecera + String.format("%04d",contadorProductos);
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "ID_PRODUCTO='" + ID_PRODUCTO + '\'' +
                ", NOMBRE_PRODUCTO='" + NOMBRE_PRODUCTO + '\'' +
                ", precio=" + precio +
                '}';
    }
}
