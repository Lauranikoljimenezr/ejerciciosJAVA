
import java.util.ArrayList;

/*Realice un algoritmo que use un Método con parámetros y con retorno que recibe un
ArrayList de enteros y devuelve el valor máximo de la lista*/
public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(67);
        lista.add(7);
        lista.add(55);
        lista.add(9);

        int maximo = encontrarM(lista);
        System.out.println("Valor máximo: " + maximo);
    }

    public static int encontrarM(ArrayList<Integer> lista) {
        int max = lista.get(0);
        for (int num : lista) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}