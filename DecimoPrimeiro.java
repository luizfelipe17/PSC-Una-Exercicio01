package com.mycompany.exercicio01;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimoPrimeiro {
    
    public static void main(String[] args) {
    
        double nota1, nota2, nota3, resultado;
            
            Scanner ler = new Scanner (System.in);
            DecimalFormat df = new DecimalFormat ("0.00");
            
        System.out.print("Favor informe a primeira nota: ");
                nota1 = ler.nextDouble();
        
        System.out.print("Favor informe a segunda nota: ");
                nota2 = ler.nextDouble();        
        
        System.out.print("Favor informe a terceira nota: ");
                nota3 = ler.nextDouble();        
                
            resultado = (nota1 + nota2 + nota3) / 3;
                
          System.out.printf("A média simples das três notas será: "+(df.format(resultado)));  
    }
}