package com.mycompany.exercicio01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimaQuestao {
        
    public static void main(String[] args) {
        
        double celsius, fahrenheit;
    
            Scanner ler = new Scanner (System.in);
            DecimalFormat df = new DecimalFormat("###,##0.00");
            
        System.out.print("Informe a temperatura em Fahrenheit: ");
           fahrenheit = ler.nextDouble();
           
                celsius = (fahrenheit-32)*5/9;     
                
        System.out.print("O valor em graus Celsius será de: "+(df.format(celsius))+"ºC");
                
    }
    
}
