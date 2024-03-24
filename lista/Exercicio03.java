
/*
Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
 */

package lista;

import java.util.Scanner;
import classes.Vendedor;

public class Exercicio03 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Vendedor objVendedor = new Vendedor();

        System.out.println("Digite seu nome: ");
        objVendedor.nome = ler.nextLine();

        System.out.println("Digite seu salário: ");
        objVendedor.salariofixo = ler.nextDouble();

        System.out.println("Digite o total de vendas: ");
        objVendedor.vendasMes = ler.nextDouble();

        System.out.println("---------------------");
        System.out.println("Nome do vendedor: " + objVendedor.nome);

        System.out.println("Salário Fixo: " + objVendedor.salariofixo);

        System.out.println("Salário Final: " + objVendedor.salariototal());

        ler.close();
    }
}
