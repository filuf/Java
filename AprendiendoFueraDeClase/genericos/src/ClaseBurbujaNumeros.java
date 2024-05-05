public class ClaseBurbujaNumeros <N> {
    //trabajar con genéricos nos permite hacer métodos reutilizables por distintas clases

    //en este caso nuestro requisito es que extienda de Comparable
    public static <N extends Comparable<N>> void ordenarNumeros (N[] arrayNumerico ){
        for (int i = 0; i < arrayNumerico.length; i++){
            for (int j = 0; j < arrayNumerico.length - i - 1 ; j++){
                if (arrayNumerico[j].compareTo(arrayNumerico[j+1]) > 0) {
                    N aux = arrayNumerico[j];
                    arrayNumerico[j] = arrayNumerico[j + 1];
                    arrayNumerico[j + 1] = aux;
                }
            }
        }
    }
}