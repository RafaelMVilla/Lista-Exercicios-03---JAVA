
/*
A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
Professor Nível 1 R$12,00 por hora/aula
Professor Nível 2 R$17,00 por hora/aula
Professor Nível 3 R$25,00 por hora/aula
 */

package lista;

import java.util.Scanner;

import classes.NivelProfessor;

public class Exercicio20 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Nível de professor: ");
        int nivel = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite quantas horas deu aula: ");
        int horas = ler.nextInt();

        System.out.println("-------------------------");

        NivelProfessor objNivelProfessor = new NivelProfessor(nivel, horas);
        
        System.out.println("Nivel de professor: " + objNivelProfessor.nivel);

        System.out.println("Salário horas/aula: " + objNivelProfessor.calculoSalarioProfessor());




        ler.close();
    }
}
