package desearializar;

import crearSerializable.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream ficheroALeer = new FileInputStream("src/ficheros/objetosSerializados.txt"); //apuntamos al fichero
        ObjectInputStream objetoATransformar = new ObjectInputStream(ficheroALeer); //transformamos
        Persona personaDeserliazada = (Persona) objetoATransformar.readObject(); // devuelve un object y debemos castearlo

        // para comprobar que ha sido un éxito
        System.out.println("NOMBRE = "+personaDeserliazada.getNOMBRE());
        System.out.println("EDAD = "+personaDeserliazada.getEdad());
        System.out.println("debe dar null = "+personaDeserliazada.getNOMBRE_MADRE()); //este atributo no se comparte ya que está marcado como transient
    }
}
