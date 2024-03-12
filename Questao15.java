package com.mycompany.exercicio01;
import java.util.Scanner;

public class Questao15 {
    public static void main (String[] args){
    
        double a, b, c, x1, x2, delta;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Informe o valor de 'A': ");   
            a = ler.nextDouble();
            
        System.out.print("Informe o valor de 'B': ");   
            b = ler.nextDouble();    
            
        System.out.print("Informe o valor de 'C': ");   
            c = ler.nextDouble();
            
            delta = (b * b) + (-4 * (a * c));
            
            System.out.println("Delta: " + delta);
            
            if (delta >= 0){
                
            x1 = ((- b + Math.sqrt(delta)) / (2*a));
            x2 = ((- b - Math.sqrt(delta)) / (2*a));
                    
            System.out.print ("O resultado para a equação será: \n x1: "+x1+ "    x2: "+x2);
            
            }else {
                
                System.out.print ("\nDelta não possui raiz!!");
                
            }
            
    }
}
