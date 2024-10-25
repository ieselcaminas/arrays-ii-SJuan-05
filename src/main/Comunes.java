public class Comunes {
    public static String duplicado(int[] nums1, int[] nums2) {

        String resultado = " ";

        for (int i = 0; i < nums1.length; i++) {

            for (int n = 0; n < nums2.length; n++) {

                if (nums1[i] == nums2[n]) {
                    resultado += nums1[i] + " ";
                    break;
                }

            }

        }

        return resultado;

    }

    public static void main(String[] args) {

        int[] nums1 = {4, 5, 7, 9, 4, 2};
        int[] nums2 = {4, 6, 2};
        String resultado = duplicado(nums1, nums2);

        System.out.println("Los numeros que son iguales son: " + resultado);

    }
}
