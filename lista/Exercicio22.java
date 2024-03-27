
/*
Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
1 (Residência) 0,60
2 (Comércio) 0,48
3 (Indústria) 1,29
 */

package lista;

import java.util.Scanner;

import classes.Energia;

public class Exercicio22 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tipo do edifício (1 - Casa / 2- comércio / 3 - Fábrica): ");
        int tipo = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite a quantidade de dias: ");
        int dias = ler.nextInt();
        ler.nextLine();
        
        Energia objEnergia = new Energia(dias, tipo);

        System.out.println("-----------------------");

        if (tipo == 1) {
            
            System.out.println("Tipo: Residência");

        }else if (tipo == 2) {

            System.out.println("Tipo: Comércio");

        }else {

            System.out.println("Tipo: Indústria");
        }


        System.out.println("Custo de energia em " + dias + " : R$ " + objEnergia.calcularEnergia());

        ler.close();
    }
}
