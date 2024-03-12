package com.mycompany.exercicio01;

import java.util.Scanner;


public class Questao18 {
    public static void main (String[] args){

        double alturaDegrau, alturaDesejada, qtsDegrau;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite qual a altura de cada degrau (METROS): ");
                alturaDegrau = ler.nextDouble();
                
        System.out.print("Digite qual a altura total desejada (METROS): ");
                alturaDesejada = ler.nextDouble();
                
              qtsDegrau = alturaDesejada / alturaDegrau;
              
          System.out.print("A quantidade nescessária de degrau será de: "+Math.round(qtsDegrau));
              
    }
}