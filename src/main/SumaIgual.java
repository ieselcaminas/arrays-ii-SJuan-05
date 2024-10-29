import java.util.Scanner;

public class SumaIgual {
    public static String sumaIgual(int [] num_pares, int total){

        int resultado;
        String resultado_total;
        String resultado_final = "";


        for (int i = 0; i < num_pares.length; i++) {

            for (int j = i + 1; j < num_pares.length; j++) {

                resultado = num_pares[i] + num_pares[j];

                if (total == resultado) {

                    resultado_total = "[" + num_pares[i] + " + " + num_pares[j] + "] ";
                    resultado_final += resultado_total;

                }

            }

        }

        return resultado_final;

    }

    public static void main(String[] args) {

        int [] num_pares = {5, 6, 8, 3, 4, 1, 7};
        int total;
        int resultado = 0;
        String resultado_total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el resultado y le mostraré las opciones del array que sumandolas dan dicho resultado");
        total = sc.nextInt();

        resultado_total = sumaIgual(num_pares, total);

        System.out.println(resultado_total);


    }
}
