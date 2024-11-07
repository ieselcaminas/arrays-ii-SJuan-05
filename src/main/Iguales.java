import java.util.Arrays;

public class Iguales {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};

        // Clonamos el array original
        int[] arrayClonado = arrayOriginal.clone();

        // Comparar los dos arrays
        boolean sonIguales = Arrays.equals(arrayOriginal, arrayClonado);

        // Mostrar resultado de la comparación
        if (sonIguales) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }
}
