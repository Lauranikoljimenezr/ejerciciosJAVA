/*Realice un algoritmo que use un Método sin parámetros y con retorno que genera
un número aleatorio entre 1 y 100 y lo devuelve como resultado:*/
public class ejercicio3 {
    public static void main(String[] args) {
        int numero = numAleatorio();
        System.out.println("Número aleatorio: " + numero);
    }

    public static int numAleatorio() {
        int rango = 100;
        int numeroAleatorio = (int) (Math.random() * rango) + 1;
        return numeroAleatorio;
    }
}