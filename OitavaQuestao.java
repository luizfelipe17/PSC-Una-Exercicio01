package com.mycompany.exercicio01;
import java.util.Scanner;

public class OitavaQuestao {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        double metros, centimetros;
       
        System.out.print("Informe o valor em metros: ");
        
            metros = ler.nextDouble();
            
            centimetros = metros*100;
            
        System.out.print("O valor em centímetros será: "+centimetros+"cm");
    }
}
