
/*
/*
Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres.
 */

package lista;

import java.util.Scanner;
import classes.Identidade;

public class Exercicio11 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        
        
        Identidade[] pessoas = new Identidade[56];

        for (int i = 0; i < 56; i++) {

            System.out.println("Digite o seu nome: ");
            String nome = ler.nextLine();
            
            System.out.println("Digite seu sexo (F / M): ");
            char sexo = ler.nextLine().charAt(0);
            
            pessoas[i] = new Identidade(nome, sexo);

            System.out.println("-------------------------");
        }

        int contHomens = 0;
        int contMulheres = 0;

        for (int i = 0; i < 56; i++) {
            
            System.out.println( (i + 1) + "º Nome: "+ pessoas[i].nome);
            
            if (pessoas[i].sexo == 'M' || pessoas[i].sexo == 'm') {
                System.out.println((i + 1) + "º Sexo: Homem");
                System.out.println("---------------------------");
                contHomens++;
            } else if (pessoas[i].sexo == 'F' || pessoas[i].sexo == 'f') {
                System.out.println((i + 1) + "º Sexo: Mulher");
                System.out.println("---------------------------");
                contMulheres++;
            }
        }

        System.out.println("Total de homens: " + contHomens);
        System.out.println("Total de mulheres: " + contMulheres);

        ler.close();
    }
}
