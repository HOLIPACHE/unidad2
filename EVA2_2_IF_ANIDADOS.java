/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int VALOR1, VALOR2;
        Scanner leer = new Scanner(System.in);
        System.out.println("VALOR 1: ");
        VALOR1=leer.nextInt();
        System.out.println("VALOR 2: ");
        VALOR2=leer.nextInt();
        //>OPERADOR
        if(VALOR1>VALOR2)                                 //CONCATENAR
            System.out.println("EL VALOR MAS GRANDE ES EL "+VALOR1);
        else{//FALSO, EL VALOR1 NO ES MAS GRANDE QUE EL VALOR2
          //if anidado, un if dentro de otro if
          //EN JAVA;
          //=ES UNA ASIGNACION
          //==ES COMPARACION
          if(VALOR1==VALOR2)//VERDAD
                System.out.println("Ambos valores son iguales");
          else
                System.out.println("El valor mas pequeño es "+VALOR1);
              
        }
    }
    
}
