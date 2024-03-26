/*
Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.
 */

package lista;

import java.util.Scanner;

import classes.Exercito;

public class Exercicio13 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pessoas: ");
        int qtdePessoas = ler.nextInt();
        ler.nextLine();
        
        Exercito[] objExercito = new Exercito[qtdePessoas];

        for (int i = 0; i < qtdePessoas; i++) {
            
            System.out.println("Digite seu nome: ");
            String nome = ler.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();
            ler.nextLine();

            System.out.println("Tem problemas de saúde (S / N): ");
            char saude = ler.nextLine().charAt(0);

            objExercito[i] = new Exercito(nome, idade, saude);

            System.out.println("---------------------");
        }

        for (int i = 0; i < qtdePessoas; i++) {

            
            if (objExercito[i].verificarSaude() == 1) {
                System.out.println("Nome: " + objExercito[i].nome);
                System.out.println("Idade: " + objExercito[i].idade);
                System.out.println("Saúde: Arriscada");
                System.out.println("Essa pessoa não está apta para servir!");

                System.out.println("-------------------------");
                
            } else if (objExercito[i].verificarSaude() == 0) {
                System.out.println("Nome: " + objExercito[i].nome);
                System.out.println("Idade: " + objExercito[i].idade);
                System.out.println("Saúde: Boa");
                System.out.println("Essa pessoa está apta para servir!");
                
                System.out.println("-------------------------");
            }
        }

        ler.close();
    }
}
