
/*
Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).
 */

package lista;

import java.util.Scanner;

import classes.NotasAluno;

public class Exercicio08 {

    public static void executar(){

        Scanner ler = new Scanner(System.in);
        NotasAluno objAluno = new NotasAluno();

        System.out.println("Digite seu nome: ");
        objAluno.nome = ler.nextLine();

        System.out.println("Digite sua primeira nota: ");
        objAluno.nota1 = ler.nextDouble();


        System.out.println("Digite sua segunda nota: ");
        objAluno.nota2 = ler.nextDouble();


        System.out.println("Digite sua terceira nota: ");
        objAluno.nota3 = ler.nextDouble();



        System.out.println("--------------------");
        System.out.println("Nome: " + objAluno.nome);

        if (objAluno.calculoNotas() >= 7) {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Aprovado :)");
        } else if (objAluno.calculoNotas() > 5.1 && objAluno.calculoNotas() < 6.9) {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Recuperação :|");
        } else {
            System.out.println("Média: " + objAluno.calculoNotas() + " , Reprovado :(");
        }


        ler.close();
    }
}
