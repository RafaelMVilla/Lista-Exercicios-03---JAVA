
/*
Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
 */

package lista;

import java.util.Scanner;
import classes.Custo;

public class Exercicio06 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Custo objCusto = new Custo();

        String entradaPrecoCusto = "";
        String entradaAcrescimo = "";

        while (Custo.isDouble(entradaPrecoCusto) == false) {
            
            System.out.println("Digite o preço de custo do produto: ");
            entradaPrecoCusto = ler.nextLine();
        }

        while (Custo.isDouble(entradaAcrescimo) == false) {
            
            System.out.println("Digite a percentagem de acréscimo: ");
            entradaAcrescimo = ler.nextLine();
        }

        objCusto.precoCusto = Double.parseDouble(entradaPrecoCusto);
        objCusto.acrescimo = Double.parseDouble(entradaAcrescimo);

        System.out.println("--------------------");
        System.out.println("Preço Custo: " + objCusto.precoCusto);
        System.out.println("Acréscimo: " + objCusto.acrescimo);
        
        System.out.println("--------------------");

        System.out.printf("Preço Final: %.2f",  objCusto.calcularPrecofinal());

        ler.close();
    }
    
}
