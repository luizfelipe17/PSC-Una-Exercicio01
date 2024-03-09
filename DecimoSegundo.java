package com.mycompany.exercicio01;
import java.util.Scanner;

public class DecimoSegundo {
    
    public static void main(String [] args){
    
        int numero, antecessor, sucessor;
    
            Scanner ler = new Scanner(System.in);
        
        System.out.print("Favor informe o número: ");    
                numero = ler.nextInt();
        
            antecessor = numero - 1;
            sucessor = numero + 1;
            
        System.out.print("O valores antecessores e sucessores do número informado será:\n");
        System.out.println("ANTECESSOR: '"+antecessor+"'   SUCESSOR: '"+sucessor+"'");
    }
   
}
