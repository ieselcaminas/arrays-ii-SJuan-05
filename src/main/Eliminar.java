import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Eliminar {
    public static int[] eliminar (int[] array1, int posicion){

        int aux = array1[posicion];

        for (int i = posicion; i < array1.length -1; i++){

            array1[i]= array1[i + 1];

        }

        array1[array1.length - 1 ] = aux;
        return array1;

    }
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int posicion = 2;

        System.out.println(Arrays.toString(eliminar(array1, posicion)));

    }
}
