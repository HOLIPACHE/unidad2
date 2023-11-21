/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16.cajero;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16CAJERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta = 1000;
        int retiro = 0;
        Scanner leer = new Scanner(System.in);
        
        while(cuenta > 0){
            System.out.println("cunmeto quieres retira");
            retiro= leer.nextInt();
            cuenta -=retiro;
            System.out.println("tu saldo es de:"+cuenta);
        }
    }
    
}
