/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // char caracter = 'A';
        // int c = caracter;
        // System.out.println((int)caracter);
         String cadena = " a e i o u ";
        char valor;
        int valorNumerico;
            
           System.out.println(cadena.length()); 
        
     
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); 
            valorNumerico = (int) valor; 
            System.out.printf("%s (%d)\n", valor, valorNumerico);
        }
    }
}
