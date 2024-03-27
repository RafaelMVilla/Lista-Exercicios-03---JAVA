
/*
Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto. A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra em nenhuma das categorias ofertadas.

            Grupo de Risco
  Idade   Baixo    Médio     Alto
17 a 20     1        2        3
21 a 24     2        3        4
25 a 34     3        4        5
35 a 64     4        5        6
65 a 70     7        8        9
 */

package lista;

import java.util.Scanner;

import classes.Seguradora;

public class Exercicio26 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();


        System.out.println("Digite sua idade (17 - 70): ");
        int idade = ler.nextInt();
        ler.nextLine();

        if (idade < 17 || idade > 70) {
            System.out.println("Idade não permitida! Não se enquadra em nenhuma das categorias ofertadas.");
            System.exit(0);
        }
        
        System.out.println("Digite seu grupo de risco (1 - Baixo / 2 - Médio / 3 - Alto): ");
        int grupoRisco = ler.nextInt();
        ler.nextLine();

        Seguradora objSeguradora = new Seguradora(nome, idade, grupoRisco);

        System.out.println("-----------------------");
        System.out.println("Nome: " + objSeguradora.nome);
        System.out.println("Idade: " + objSeguradora.idade);

        System.out.println("Categoria Ofertada: " + objSeguradora.verificarRisco());


        ler.close();
    }
}
