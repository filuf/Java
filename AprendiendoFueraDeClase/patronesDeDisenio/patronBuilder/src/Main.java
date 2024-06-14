import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado pedro = new Empleado.Builder()
                .nombre("Pedro")
                .apellido1("Dominguez")
                .apellido2("Fernandez")
                .telefono("688763431")
                .mail("example@example.com")
                .fechaDeNacimiento(LocalDate.of(1992,2,22))
                .numeroDeHijos(5)
                .build();

        System.out.println(pedro.getNombre());
    }
}
