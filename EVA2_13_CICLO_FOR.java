/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_ciclo_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //for--> desde
        // pnto de inicio,cindicion para continuar, avance o retroceso
        // mientras la condicion es verdad el for se ejecuta
        //cuando es falso termina
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("----------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
       //imprimir los numeros pares de 0 a 100 incluyendo 0 y 100
        for(int i = 0; i <=100; i+= 2)
            System.out.print(i+"-");
    }
    
}
