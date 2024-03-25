
/*
Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive).
 */

package lista;

import java.util.Scanner;
import classes.IntervaloNumeros;

public class Exercicio09 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        IntervaloNumeros objIntervaloNumeros = new IntervaloNumeros();

        for (int i = 0; i < 80; i++) {
            
            System.out.println("Digite o "+ (i + 1) + "º número: ");
            objIntervaloNumeros.valor[i] = ler.nextInt();
        }
        
        System.out.println("---------------------------------");

        System.out.println("Você digitou " + objIntervaloNumeros.contaVerificar() + " número(s) dentro do intervalo de (10 - 150).");

        ler.close();
    }
}
