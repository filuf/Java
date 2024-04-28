package crearSerializable;

import java.io.Serializable;

public class Persona implements Serializable { // se necesita implementar esta interfaz para poder
                                               // serializar, los objetos heredados no tienen que implementarla
                                               // los objetos que se incluyan en n:m 1:n y 1:1 deben implementarla
    private final String CODIGO_PERSONA;
    private static int contadorPersonas; // las variables estáticas no serializan
    private final String NOMBRE;
    private int edad;
    private final transient String NOMBRE_MADRE; // transient en un atributo no serializa
    private final static String CIUDAD = "Madrid"; // las variables estáticas no serializan

    public Persona(String nombre, int edad, String nombreMadre) {
        this.NOMBRE = nombre;
        this.edad = edad;
        this.NOMBRE_MADRE = nombreMadre;
        CODIGO_PERSONA = generarCodPersona();
    }

    private String generarCodPersona() {
        contadorPersonas++;
        String cabecera = "PERS";
        String cola = String.format("%04d", contadorPersonas);
        return cabecera + cola;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
