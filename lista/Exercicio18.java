
/*
Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
Sexo     Idade     Abono
  M      >= 30     100,00
          < 30      50,00
  F      >= 30     200,00
          < 30      80,00
 */

package lista;

import java.util.Scanner;

import classes.FuncionarioAbono;

public class Exercicio18 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();
        
        System.out.println("Digite seu sexo (M / F): ");
        char sexo = ler.nextLine().charAt(0);
        
        System.out.println("Digite seu salario: ");
        double salario = ler.nextDouble();
        
        FuncionarioAbono objFuncionarioAbono = new FuncionarioAbono(nome, idade, sexo, salario);

        System.out.println("-------------------------------");

        System.out.println("Nome: " + objFuncionarioAbono.nome);

        System.out.println("Idade: " + objFuncionarioAbono.idade);

        System.out.println("Sexo: " + objFuncionarioAbono.sexo);

        System.out.println("Salário antes do abono: " + objFuncionarioAbono.salario);

        if (objFuncionarioAbono.verificarSexo() == 0) {
            
            System.out.println("Salário após abono: " + objFuncionarioAbono.verificarSalarioSexoMasc());

        }else if (objFuncionarioAbono.verificarSexo() == 1) {
            System.out.println("Salário após abono: " + objFuncionarioAbono.verificarSalarioSexoFem());
        }



        ler.close();
    }
}
