import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GetMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        //forma antigua
        // URL direccion = new URL("");
        // HttpURLConnection conexion = (HttpURLConnection) direccion.openConnection();

        //a partir de jdk 11
        HttpClient cliente = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2) //versión del cliente
                .connectTimeout(Duration.ofSeconds(50)) //cierre de conexión si dura más de N
                .build();

        URI uriPrueba = URI.create("https://dummy.restapiexample.com/api/v1/employees");
        //  API REST PARA PRUEBAS  https://dummy.restapiexample.com/

        HttpRequest request = HttpRequest.newBuilder()
                .GET() //petición GET
                .uri(uriPrueba) //uri a donde apunta
                .setHeader("User-Agent", "Chrome/114.0.0.0")
                .build();

        HttpResponse<String> respuesta = cliente.send(
                request, HttpResponse.BodyHandlers.ofString());

        System.out.println("[+] Codigo de status -> "+respuesta.statusCode());

        respuesta.headers().map().forEach((key, valueList) -> {
            System.out.println("llave -> "+ key);
            valueList.forEach(s -> System.out.println("valor -> "+s));
        });

        //cuerpo
        System.out.println(respuesta.body());
    }


}
