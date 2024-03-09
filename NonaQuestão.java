package com.mycompany.exercicio01;
import java.util.Scanner;
import java.text.DecimalFormat;

public class NonaQuestão {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        double areaCirculo, raio, pi = 3.14;
        
  Scanner ler = new Scanner (System.in);
     
        System.out.print("Digite o valor do raio do círculo: ");
               raio = ler.nextDouble();
               
           
             areaCirculo = pi*(raio*raio);
               
        System.out.print("A área do círculo será de: "+(df.format(areaCirculo)));       
        
    }
}
