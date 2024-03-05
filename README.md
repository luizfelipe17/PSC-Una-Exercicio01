package com.mycompany.primeiraquestao;
import java.util.Scanner;

public class PrimeiraQuestao {

    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
        
        double numero1, numero2, resultado;
        
        System.out.print("Digite o primeiro número: ");
        numero1 = ler.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        numero2 = ler.nextDouble();
        
        resultado = numero1 + numero2;
        
        
        System.out.println(+numero1 + " + " +numero2 + " = " +resultado);
        System.out.println("O resultado da soma entre os dois números será: " +resultado);
        
        }
    }
