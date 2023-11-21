/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1, var2, resu;
        var1=100;
        var2=200;
        resu = var1 +var2;
        //suma
        System.out.println(" suma:");
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2);
        System.out.println(" var1 + var2"+ resu);
        System.out.println(" resta:");
        //resta
         resu = var1 -var2;
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2);
        System.out.println(" var1 - var2"+ resu);
        //multiplicacion
         resu = var1 *var2;
        System.out.println(" multiplicacion:");
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2);
        System.out.println(" var1 * var2"+ resu);
        //divicion
        var1 =15;
        var2 = 7;
        resu = var1 /var2;
        System.out.println(" divicion:");
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2);
        System.out.println(" var1 / var2"+ resu);
        
        //division double
        double resuExacto;
        resuExacto = var1 / var2;
         System.out.println(" division exacta=:");
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2);
        System.out.println(" var1 / var2"+ resuExacto);
        
        double var2f = 7;
        resuExacto = var1 / var2;
         System.out.println(" division exacta=:");
        System.out.println(" var1=" + var1);
        System.out.println(" var2=" + var2f);
        System.out.println(" var1 / var2"+ resuExacto);
        
        int cifra = 7;
        double cifradouble = 7.0;
        
        double division = 100/10;//SE TOMA EL DIVISOR COMO ENTERO
        //double division = 100/10.0;//SE TOMA EL DIVISOR COMO FLOTANTE
        
        //PRECEDENCIA DE OPRACIONES
        int a = 5, b = 3, c = 2;
        int resultado = (a*b)+(a-c)*(b-a);//(15)+(3)*(-2)//15-6
        System.out.println("resutaldo precedencia;"+resultado);
               
        //potencia y raices
        double potencia; 
        potencia = Math.pow(100, 2);
        System.out.println("potencia="+resultado);
    }
    
}
