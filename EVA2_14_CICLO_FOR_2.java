/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclo_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vamos a generar cacalificaciones de un grupo y generar promedio
        // el promedio
        int NOCALIFAS;
        Scanner leer = new Scanner(System.in);
        System.out.println("introduce el numero de calificaciones:");
        NOCALIFAS = leer.nextInt();
        for(int i = 0; i < NOCALIFAS; i++){
            System.out.println("introduce lka calificacion: ");
            int califa = leer.nextInt(); 
        }
        
    }
    
}
