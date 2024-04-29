package crearSerializable;

import java.io.FileOutputStream;
import java.io.IOException; //debemos importar esta excepción
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Persona miPersona1 = new Persona("Pedro",43,"Maite"); // el objeto debe implementar la interfaz Serilizable

        FileOutputStream ficheroAVolcar = new FileOutputStream("src/ficheros/objetosSerializados.txt"); //ruta donde se crea o se usa el fichero en el que se va a guardar el objeto serializado (la ruta se toma desde la raiz del proyecto (he estado 55 minutos para descubrir esto))
        ObjectOutputStream objetoAVolcar = new ObjectOutputStream(ficheroAVolcar); // convierte este objeto en una cadena de bytes y apunta a un fichero de la clase FileOutputStream
        objetoAVolcar.writeObject(miPersona1); //escribimos el objeto en forma de bytes
        objetoAVolcar.close(); //cerramos el flujo
    }
}
