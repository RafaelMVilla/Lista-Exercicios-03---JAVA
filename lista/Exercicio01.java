
/*
Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).
 */


package lista;

import java.util.Scanner;
import classes.Aluno;

public class Exercicio01 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        Aluno objAluno = new Aluno();

        System.out.println("Digite o nome: ");
        objAluno.nome = ler.nextLine();

        
        System.out.println("Digite sua primeira nota: ");
        objAluno.nota1 = ler.nextFloat();
        double nota1 = objAluno.nota1;
        
        System.out.println("Digite sua egunda nota: ");
        objAluno.nota2 = ler.nextFloat();
        double nota2 = objAluno.nota2;
        
        System.out.println("Digite sua terceira nota: ");
        objAluno.nota3 = ler.nextFloat();
        double nota3 = objAluno.nota3;

        double media = objAluno.media();

        System.out.println("----------------------------");
        System.out.println("Nome do aluno: " + objAluno.nome);
        System.out.println("Media do aluno: " + objAluno.media());

        ler.close();
    }
}
