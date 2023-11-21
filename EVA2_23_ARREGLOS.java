/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_23_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_23_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECLARAR EL ARREGLO: 
        
        int [] arreglo = new int [100000];
        //como se usa, el acceso es por indices
        //el primer elemento del arreglo esta en la posicion 0
        // ultimo elemento del arreglo es n - 1,n es el tamaño del arreglo
        arreglo[0]= 100;
        arreglo[1]= 200;
        arreglo[2]= 300;
        arreglo[3]= 400;
        
        System.out.println(arreglo[3]);
        ///
        String[]arregloCode = new String[5];
        arregloCode[0] = "hola";
         arregloCode[1] = "";
          arregloCode[2] = "mundo";
           arregloCode[3] = "";
            arregloCode[4] = "cruel!!!";
            System.out.println(arregloCode[0]);
            System.out.println(arregloCode[1]);
            System.out.println(arregloCode[2]);
            System.out.println(arregloCode[3]);
            System.out.println(arregloCode[4]);
            
            arregloCode = new String[10];
    }
    
}
