
/*
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.
 */

package lista;

import java.util.Scanner;

import classes.EmpresaFolhaPagamento;

public class Exercicio17 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = ler.nextLine();

        System.out.println("Digite o seu salário: ");
        double salarioFuncionario = ler.nextDouble();

        System.out.println("Digite o salário mínimo: ");
        double salarioMinimo = ler.nextDouble();

        System.out.println("Digite a percentagem de reajuste desejada: ");
        double percReajuste = ler.nextDouble();

        EmpresaFolhaPagamento objEmpresaFolhaPagamento = new EmpresaFolhaPagamento(nome, salarioFuncionario, salarioMinimo, percReajuste);

        System.out.println("----------------------------");

        System.out.println("Nome: " + objEmpresaFolhaPagamento.nome);

        System.out.println("Salário mínimo: " + objEmpresaFolhaPagamento.salarioMinimo);

        System.out.println("Salário anterior ao reajuste: " + objEmpresaFolhaPagamento.salarioFuncionario);

        System.out.println("Salário após o reajuste: " + objEmpresaFolhaPagamento.calcularReajuste());

        

        ler.close();
    }
}
