
/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.
 */

package lista;

import java.util.Scanner;

import classes.FabricaCarro;


public class Exercicio07 {

    public static void executar(){

        Scanner ler = new Scanner(System.in);
        FabricaCarro objCarro = new FabricaCarro();

        System.out.println("Digite o valor de fábrica do carro: ");
        objCarro.custofabrica = ler.nextDouble();

        System.out.println("-------------------");
        System.out.println("Custo de fábrica: " + objCarro.custofabrica);
        System.out.println("Percentagem da Distribuidora: " + objCarro.percentagemdistr);
        System.out.println("Impostos: " + objCarro.impostos);
        System.out.println("-------------------");
        System.out.println("Valor Final: " + objCarro.calcularCustoCarro());


        ler.close();
    }
}
