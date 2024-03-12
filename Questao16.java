
package com.mycompany.exercicio01;
import java.util.Scanner; 

public class Questao16 {
    public static void main (String[] args){
        
        double quilometragem, combustivel, consumoMedio;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite a quilometragem percorrida: ");
            quilometragem = ler.nextDouble();
            
        System.out.print("Digite a quantidade de combustível consumido: ");
            combustivel = ler.nextDouble();   
            
            
                    consumoMedio = quilometragem / combustivel;
                    
            System.out.print("O consumo médio de combustível foi de: "+consumoMedio+"km/l");
        
    }
}
