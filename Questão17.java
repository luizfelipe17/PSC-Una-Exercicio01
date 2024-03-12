
package com.mycompany.exercicio01;

import java.util.Scanner;

public class Questão17 {
    public static void main(String[] args){

        double troco, valorCaneta;
        int valorReais, qtsCaneta;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite o valor em notas pago: ");
            valorReais = ler.nextInt();
            
        System.out.print("Qual o valor do troco: ");
            troco = ler.nextDouble();    
            
        System.out.print("Digite a quantidades de canetas: ");
            qtsCaneta = ler.nextInt();    
           
            valorCaneta = (valorReais - troco) / qtsCaneta;
            
            
            System.out.printf("\nO valor de cada caneta será: R$%.2f", valorCaneta);
    }
}  
    
