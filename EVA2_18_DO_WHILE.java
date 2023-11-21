/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int nume;
        
        do{
            System.out.println("intenta adivinar el numero");
            nume= leer.nextInt();
        }while(nume != 100);
        System.out.println("!!adivinaste!!");
        
    }
    
}
