/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner leer = new Scanner(System.in);
        System.out.println("introduce tu calificacion");
        califa = leer.nextInt();
        
        if(califa >= 70){//if(exprecion a evaluar)// esto se ejecuta
            System.out.println("aprobaste !!!");
            System.out.println("librate del mal");
        }else// esto se ejecuta si es falso.else es opcional
            System.out.println("No aprobaste");
    }
    
}
