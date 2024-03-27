
/*
Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas. A lista abaixo fornece os pesos:
a. Laboratório: peso 2
b. Avaliação semestral: peso 3
c. Exame final: peso 5
 */

package lista;

import java.util.Scanner;

import classes.ComputacaoMedia;

public class Exercicio24 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        
        
        System.out.println("Digite sua primeira nota: ");
        double nota2 = ler.nextDouble();
        
        
        
        System.out.println("Digite sua primeira nota: ");
        double nota3 = ler.nextDouble();

        ComputacaoMedia objComputacaoMedia = new ComputacaoMedia(nota1, nota2, nota3);

        System.out.println("--------------------------");

        System.out.println("Nota final: " + objComputacaoMedia.calculoMedia());


        ler.close();
    }
}
