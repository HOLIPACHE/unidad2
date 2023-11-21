/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_25_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[]arregloCali;
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas calificaciones se van a capturar?");
        cant = leer.nextInt();
        arregloCali= new int[cant];
        for(int i = 0; i < cant; i++){
            System.out.println("introduuce la calificacion");
            arregloCali[i] = leer.nextInt();   
        }
        for(int i = 0; i < cant; i++){
            System.out.println(arregloCali[i]+ " - ");
            
        }
    }
    
}
