/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao3_temperatura;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Repeticao3_temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       int C,F,result, i;
       System.out.print("Digite a temperatura em Celsius: ");
       C = entrada.nextInt();
       F =(int) ((C*1.8)+32);
       System.out.println("A temperatura em fahrenheit é:"+F);
       System.out.println("temperatura em fahrenheit subindo de 10 em 10 até 100");
        for(i=10; i<=100; i+=10 )
        {
         result=F+i;
         System.out.println(result);
         
        }
        
    }
    
}
