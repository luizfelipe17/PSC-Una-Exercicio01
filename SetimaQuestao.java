package com.mycompany.exercicio01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SetimaQuestao {

    public static void main(String[] args) {
     
        Scanner ler = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        double salario, salarioReajustado;
        
        System.out.print("Favor informe seu salário: R$");
            
           salario = ler.nextDouble();
           salarioReajustado =  salario + (salario*7/100);
           
    System.out.print("O salário após o reajuste será: R$"+(df.format(salarioReajustado)));
                        
        
    }
    
}
