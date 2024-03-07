package com.mycompany.exercicio01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuintaQuestao {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
     
        double valorReal, valorDolar;
        
        System.out.print("Digite o valor em 'Dólar': US$");
            valorDolar = ler.nextDouble();
            
            valorReal = valorDolar*4.95;
            
            System.out.print("O valor em real será: R$"+(df.format(valorReal)));
    }
    
}
