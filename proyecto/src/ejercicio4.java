/*Realice un algoritmo que use un Método con parámetros y
con retorno que recibe un arreglo de enteros y devuelve el valor máximo del arreglo*/
public class ejercicio4 {
    public static void main(String[] args) {
        int[] array = {4, 33, 2, 24, 3}; 
        int maximo = encontrarM(array);
        System.out.println("Valor máximo: " + maximo);
    }

    public static int encontrarM(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}