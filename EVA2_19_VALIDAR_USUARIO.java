/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_validar_usuario;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "ADMIN";
    final static String PASSWORD = "ADMIN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        Scanner leer = new Scanner(System.in);
        System.out.println(NOMBRE_USUARIO);
        
        
        do{
            System.out.println("introduce el usuario");
            usuario= leer.nextLine();
            System.out.println("introduce la contraceña");
            password= leer.nextLine();
            
        }while((!usuario.equals(NOMBRE_USUARIO)) || (!password.equals(PASSWORD)));
        System.out.println("ACCESO CONCEDIDO");
    }
    
}
