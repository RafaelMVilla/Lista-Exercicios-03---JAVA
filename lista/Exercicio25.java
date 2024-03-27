
/*
Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas, desenvolva um programa para calcular a nota final e a classificação de cada estudante. A classificação é dada conforme a lista abaixo:
Nota Final Classificação
[8,10] A
[7,8] B
[6,7] C
[5,6] D
[0,5] R
Imprima o nome do estudante, com o seu número, nota final e classificação.
 */

package lista;

import java.util.Scanner;

import classes.NotasMatricula;


public class Exercicio25 {
    
    public static void executar(){

        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite seu número de matrícula:  ");
        int matricula = ler.nextInt();
        
        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        
        
        System.out.println("Digite sua primeira nota: ");
        double nota2 = ler.nextDouble();
        
        
        
        System.out.println("Digite sua primeira nota: ");
        double nota3 = ler.nextDouble();
        
        
        NotasMatricula objNotasMatricula = new NotasMatricula(nome,matricula, nota1, nota2, nota3);
        
        System.out.println("--------------------------");
        System.out.println("Nome: " + objNotasMatricula.nome);
        System.out.println("Matrícula: " + objNotasMatricula.matricula);
        System.out.println("Média Final: " + objNotasMatricula.calculoMedia());
        
        if (objNotasMatricula.calculoMedia() <= 10 && objNotasMatricula.calculoMedia() >= 8) {
            
            System.out.println("Nota final Classificação: A");
        }else if (objNotasMatricula.calculoMedia() < 8 && objNotasMatricula.calculoMedia() >= 7) {
            
            System.out.println("Nota final Classificação: B");
        }else if (objNotasMatricula.calculoMedia() < 7 && objNotasMatricula.calculoMedia() >= 6) {
            
            System.out.println("Nota final Classificação: C");
        }else if (objNotasMatricula.calculoMedia() < 6 && objNotasMatricula.calculoMedia() >= 5) {
            
            System.out.println("Nota final Classificação: D");
        }else if (objNotasMatricula.calculoMedia() < 5 && objNotasMatricula.calculoMedia() >= 0) {
            
            System.out.println("Nota final Classificação: R");
        }
        
        ler.close();
    }
}
