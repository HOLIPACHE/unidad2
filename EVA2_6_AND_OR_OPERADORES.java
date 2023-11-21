/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
   int califa;
           System.out.println("introduce la califa; ");
           califa = leer.nextInt();
           
           //VALIDAR
           //UNA CALIFA ES MYAOR O IGUAL A 0 --> CALIFA >=0
           //Y
           //LA CALIFA ES MENOR O IGUAL A 100--> CALIFA <=100
           if ((califa >= 0)&&(califa <=100)){//VALOR VALIDO
               System.out.println("la califa "+ califa+ "es valida!!"); 
               if(califa>=70){
                   System.out.println("aprovado");
               }else
                   System.out.println("no aprovaste");
                   
           }else{
             System.out.println("la califa "+califa+ "no es valida!!");
            }
           
           
    }
    
}
