import java.time.LocalDate;

public class Empleado {

    //en clases donde tenemos muchos atributos, el hecho de instanciar un objeto en nuestro main
    //se puede llegar a hacer confuso por el gran número de parámetros a proporcionar
    public static final LocalDate FECHA_CREACION_EMPRESA = LocalDate.of(1990,1,1);
    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String mail;
    private final String telefono;
    private final float altura;
    private final int numeroDeHijos;
    private final LocalDate fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public float getAltura() {
        return altura;
    }

    public int getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    //creamos una clase interna ESTÁTICA pero con los atributos mutables
    public static class Builder {
        private String nombre;
        private String apellido1;
        private String apellido2;
        private String mail;
        private String telefono;
        private float altura;
        private int numeroDeHijos;
        private LocalDate fechaDeNacimiento;



        //creamos unos setter, pero en vez de ser void, son de nuestra clase, algunas veces podemos encontrarlos
        //como setAtr, pero muchas veces lo encontraremos simplemente con el nombre del atributo

        //los setter deben tener esta estructura
        public Empleado.Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Empleado.Builder apellido1(String apellido1) {
            this.apellido1 = apellido1;
            return this;
        }

        public Empleado.Builder apellido2(String apellido2) {
            this.apellido2 = apellido2;
            return this;
        }

        public Empleado.Builder mail(String mail) {
            this.mail = mail;
            return this;
        }
        public Empleado.Builder telefono (String telefono) {
            this.telefono = telefono;
            return this;
        }
        public Empleado.Builder altura (float altura) {
            this.altura = altura;
            return this;
        }
        public Empleado.Builder numeroDeHijos (int numeroDeHijos) {
            this.numeroDeHijos = numeroDeHijos;
            return this;
        }
        public Empleado.Builder fechaDeNacimiento (LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }

        //una vez hechos los setter, debemos crear el método build que devuelve el propio objeto de la clase principal
        public Empleado build() throws IllegalArgumentException {
            //si queremos validar atributos, podemos hacerlo en el propio build
            if (mail == null) {
                mail = "undefined";
            }
            if (apellido2 == null) apellido2 = "";
            if (nombre == null) throw new IllegalArgumentException("[!] El nombre no puede ser null");

            return new Empleado(this);
        }
    }
    //también debemos crear un constructor de la clase principal que reciba un objeto de Builder
    //este objeto es el que le estamos enviando
    public Empleado (Builder builder) {
        this.nombre = builder.nombre;
        this.apellido1 = builder.apellido1;
        this.apellido2 = builder.apellido2;
        this.mail = builder.mail;
        this.telefono = builder.telefono;
        this.altura = builder.altura;
        this.numeroDeHijos = builder.numeroDeHijos;
        this.fechaDeNacimiento = builder.fechaDeNacimiento;
    }
}
