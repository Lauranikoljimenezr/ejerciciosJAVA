/*Realice un algoritmo que use un Método con parámetros y con retorno que recibe
dos arreglos de enteros del mismo tamaño y devuelve un nuevo arreglo que contiene
la suma de los elementos de ambos arreglos:*/
public class ejercicio6 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};

        int[] suma = sumarArreglos(arreglo1, arreglo2);
        for (int num : suma) {
            System.out.print(num + " ");
        }
    }

    public static int[] sumarArreglos(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] + arr2[i];
        }
        return resultado;
    }
}