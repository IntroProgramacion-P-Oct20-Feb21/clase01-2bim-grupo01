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
public class Ejemplo02 {
    public static void main(String[] args) {
        String cadena = "Ecuador sudamerica";
        char valor;
        int valorNumerico;
        int contadorMayusculas = 0 ;
        int contadorMinusculas = 0 ;
        //System.out.println(cadena.length()); // 7
        
        // for (int i = 0; i < 7; i++) { // 0 , 1 , 2, 3, 4 , 5, 6
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); // Ecuador.charAt(0) >> E 
                                      // Ecuador.charAt(1) >> c
                                      // Ecuador.charAt(2) >> u
                                      // Ecuador.charAt(3) >> a
                                      // Ecuador.charAt(4) >> d
                                      // Ecuador.charAt(5) >> o
                                      // Ecuador.charAt(6) >> r
                                
            valorNumerico = ((int)valor); 
            if ((valorNumerico >= 97) && (valorNumerico <= 122)){
                contadorMinusculas = contadorMinusculas + 1;
            }
            if ((valorNumerico >= 65) && (valorNumerico <= 90)){
                contadorMayusculas = contadorMayusculas + 1;
            }
            
        }
        System.out.printf("En la cadena ingresada existen: "
                + "%d letras mayusculas y %d letras minusculas.\n",
                contadorMayusculas,
                contadorMinusculas);
    }
}
