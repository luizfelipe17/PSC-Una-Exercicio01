package com.mycompany.exercicio01;
import java.util.Scanner;

public class QuartaQuestao {

    public static void main(String[] args) {
       
       String nome, rua, bairro, cidade, estado;
       long telefone;
       int numero, ddd;
       
       Scanner ler = new Scanner(System.in);
       Scanner input = new Scanner(System.in);
      
       
       System.out.print("Informe seu nome completo: ");
            nome = ler.nextLine();
            
       System.out.print("Informe o seu ddd: ");     
            ddd = ler.nextInt();
            
       System.out.print("Informe o seu telefone: ");     
            telefone = ler.nextLong();     
            
       System.out.print("Informe sua rua: ");
            rua = input.nextLine();
            
       System.out.print("Informe o número da sua residência: ");
            numero = ler.nextInt(); 
            
       System.out.print("Informe seu bairro: ");
            bairro = input.nextLine();     
        
       System.out.print("Informe sua cidade: ");
            cidade = input.nextLine(); 
            
       System.out.print("Informe sua estado 'SIGLA': ");
            estado = ler.next();     
            
            System.out.println("\nSegue as informações:\n");
                    System.out.print("Nome: "+nome+"\nTelefone:("+ddd+") "+telefone+"\nEndereço: "+rua+", Nº"+numero+" - Bairro: "+bairro+" / "+cidade+"-"+estado);
    }
    
}
