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
        String cadena = "";
        
        
        for (int i = 97; i <= 122; i++) {
            switch ((char)i){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':            
                    cadena = String.format("%s%s |%d|\n", cadena, (char)i, i);
                    break;
            }
        
        }
        System.out.printf("%s", cadena);
    }
}
