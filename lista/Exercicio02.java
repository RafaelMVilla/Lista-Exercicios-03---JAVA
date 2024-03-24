
/*
Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */

package lista;

import java.util.Scanner;
import classes.Automovel;;

public class Exercicio02 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Automovel objCombustivelgasto = new Automovel();

        System.out.println("Informe a distância percorrida(em km): ");
        objCombustivelgasto.distancia = ler.nextDouble();

        System.out.println("Informe o total de combustível gasto(em litros): ");
        objCombustivelgasto.combGasto = ler.nextDouble();

        System.out.println("-----------------------------");
        System.out.printf("O consumo médio foi de: %.2f (Km / L)",objCombustivelgasto.resultado());

        ler.close();
    }
}
