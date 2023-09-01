


/*Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap
o HashTable donde las claves sean palabras en inglés y los valores sean las traducciones al español. 
Permite al usuario ingresar una palabra en inglés 
y muestra su traducción en español si está en el diccionario.*/


import java.util.HashMap;

import javax.swing.JOptionPane;

public class ejercicio7 {
   public static void main (String[] arg) {
       Traduccion();
       }
    
    public static void Traduccion() {
        HashMap<String, String> diIng = new HashMap<String, String>();
        diIng.put("hello","hola");
        diIng.put("love","amor");
        diIng.put("cat","gato");
        diIng.put("dog","perro");

         String palabra = JOptionPane.showInputDialog("ingrese la palabra que desea buscara");
         
         if(diIng.containsKey(palabra)) {
             System.out.println("si lo contiene");
             System.out.println(palabra+ ":" +diIng.get(palabra));
         }
    
    }
}