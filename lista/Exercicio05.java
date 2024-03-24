
/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
 */

package lista;

import java.util.Scanner;
import classes.Prestacoes;

public class Exercicio05 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Prestacoes objPrestacoes = new Prestacoes();

        System.out.println("Digite o valor da compra: ");
        objPrestacoes.valorcompra = ler.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        objPrestacoes.vezes = ler.nextInt();

        System.out.println("-------------------");
        System.out.println("Valor da compra: " + objPrestacoes.valorcompra);

        System.out.printf("Valor das parcelas: " + objPrestacoes.vezes + " x " + "(%.2f)", objPrestacoes.prestacao());

        ler.close();
    }
}
