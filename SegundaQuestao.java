package com.mycompany.exercicio01;
import java.util.Scanner;

public class SegundaQuestao {

   
    public static void main(String[] args) {
         double numero1, numero2, resto;
       
       Scanner ler = new Scanner (System.in);
       
       System.out.print("Informe o primeiro número: ");
            numero1 = ler.nextDouble();
       
       System.out.print("Informe o segundo número: ");
            numero2 = ler.nextDouble();   
                
                while(numero2 == 0){
        
        System.out.print("Informe um número diferente de zero: ");
            numero2 = ler.nextDouble(); 
            
    }
            
       resto = numero1 % numero2;
       
       System.out.println("O resto da divisão será: " +resto);
       
       
   }
    
}
    
    
