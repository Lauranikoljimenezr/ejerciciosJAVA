/*Realice un algoritmo que use un Método con parámetros
y sin retorno que recibe un número entero y lo imprime en pantalla si es mayor que 10:*/
import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void imprimirNumeroM(int numero) {
        if (numero > 10) {
            System.out.println("El número es mayor que 10: " + numero);
        }
    }

    public static void main(String[] args) {
        
      
          int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero mayor a 10"));
        imprimirNumeroM(num);
    }
}