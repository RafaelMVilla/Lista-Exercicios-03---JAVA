
/*
Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
a) 50% para aqueles que ganham menos do que três salários mínimos;
b) 20% para aqueles que ganham entre três até dez salários mínimos;
c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d) 10% para os demais funcionários.
 */

package lista;

import java.util.Scanner;

import classes.EmpresaReajuste;

public class Exercicio16 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salário mínimo atual: "); 
        double salarioMinimo = ler.nextDouble();

        for (int i = 0; i < 3; i++) {

            EmpresaReajuste objEmpresaReajuste[] = new EmpresaReajuste[i];
            
            System.out.println("Digite seu salário funcionário Nº" + (i + 1) + ": ");
            double salarioFuncionario = ler.nextDouble();

            
            


            System.out.println("-------------------------");
        }

        ler.close();
    }
}
