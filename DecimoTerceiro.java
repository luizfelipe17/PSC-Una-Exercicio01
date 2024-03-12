package com.mycompany.exercicio01;
import java.util.Scanner;

public class DecimoTerceiro {
    public static void main(String[] args){
    
        double horasTrabalhadas, valorHora, salarioLiquido, inss = 7.5, desconto, salarioBruto;
            
            Scanner ler = new Scanner (System.in);
        
        System.out.print("Infome o total de horas trabalhadas no mês: ");
            horasTrabalhadas = ler.nextDouble();
        
        System.out.print("Infome o valor da hora de trabalho: ");
            valorHora = ler.nextDouble();
            
           salarioBruto = horasTrabalhadas * valorHora;
           desconto = salarioBruto * inss / 100;
           salarioLiquido = salarioBruto - desconto;
  
        
        System.out.printf("O salario líquido será de: R$ %.2f", salarioLiquido);
                
    }
}
