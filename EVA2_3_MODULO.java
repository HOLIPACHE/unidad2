/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_MODULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, residuo;
        Scanner leer = new Scanner(System.in);
        System.out.println("cual es el valor");
        valor = leer.nextInt();
        residuo =valor % 2;
        if(residuo==0)
            System.out.println("el valor es par");
        else 
            System.out.println("el valor es impar");
    }
    
}
