/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]platillos = new String[10];
        platillos[0] = "tacos";
        platillos[1] = "chilaquiles";
        platillos[2] = "enchiladad";
        platillos[3] = "chile colorado";
        platillos[4] = "torta de lomo";
        platillos[5] = "pico de gallo";
        platillos[6] = "pizza";
        platillos[7] = "chuletas";
        platillos[8] = "tlayudas";
        platillos[9] = "frijoles en lata";
        double[]precio = {20, 40, 50, 55, 60, 25, 80, 90, 100, 400};
        
        System.out.println("------MENU------");
        for(int i = 0; i <platillos.length; i++){
            System.out.println(i+"- "+platillos[i]+": $"+ precio[i]);
        }
        int opc, cant;
        Scanner leer = new Scanner(System.in);
        System.out.println("Que quieres ordenar?");
        opc= leer.nextInt();
        System.out.println("cuantas ordenes quieres");
        cant = leer.nextInt();
        System.out.println("El costo de tu pedido ess; $"+(cant*precio[opc]));
                
    }
    
}
