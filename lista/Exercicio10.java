
/*
Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18 anos como maior de idade.
 */

package lista;

import java.util.Scanner;
import classes.Maioridade;


public class Exercicio10 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pessoas: ");
        int contador = ler.nextInt();
        ler.nextLine();
        
        Maioridade objMaioridade = new Maioridade(contador);

        for (int i = 0; i < objMaioridade.contador; i++) {

            System.out.println("Digite o nome da pessoa: ");
            objMaioridade.nome[i] = ler.nextLine();

            System.out.println("Digite a idade da pessoa: ");
            objMaioridade.idade[i] = ler.nextInt();
            ler.nextLine();

            System.out.println("---------------------------");
        }

        for (int i = 0; i < objMaioridade.contador; i++) {
            
            if (objMaioridade.verificarMaioridade(i) == 1) {

                System.out.println("O " + objMaioridade.nome[i] + " é maior de idade (>= 18 anos). ");
            } else {
                
                System.out.println("O " + objMaioridade.nome[i] + " é menor de idade (< 18 anos). ");
            }
        }

        ler.close();
    }
}
