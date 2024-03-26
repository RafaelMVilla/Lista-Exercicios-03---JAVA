
/*
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral.
 */

package lista;

import java.util.Scanner;

import classes.CarangoVelho;

public class Exercicio12 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        double contaCarros = 0;
        
        System.out.println("Qual o preco do seu carro: ");
        double precoCarro = ler.nextDouble();
        
        System.out.println("Qual o ano de seu carro: ");
        int verificador = ler.nextInt();
        ler.nextLine();
        
        CarangoVelho objCarangoVelho = new CarangoVelho(precoCarro, verificador);
            
        
        System.out.println("Preço do carro com desconto: " + objCarangoVelho.contaDesconto());

        contaCarros += objCarangoVelho.contaDesconto();

        System.out.println("-------------------------");
        System.out.println("Deseja continuar? (S / N)");
        char opcao = ler.nextLine().charAt(0);

        System.out.println("---------------------------");

        do {
            
            System.out.println("Qual o preco do seu carro: ");
            precoCarro = ler.nextDouble();
            
            System.out.println("Qual o ano de seu carro: ");
            verificador = ler.nextInt();
            ler.nextLine();

            objCarangoVelho = new CarangoVelho(precoCarro, verificador);
            
            System.out.println("Preço do carro com desconto: " + objCarangoVelho.contaDesconto());

            System.out.println("Deseja continuar? (S / N)");
            opcao = ler.nextLine().charAt(0);

            contaCarros += objCarangoVelho.contaDesconto();

            System.out.println("----------------------------");
        } while (opcao == 's' || opcao == 'S');
        
        System.out.printf("Preço Total: %.2f", contaCarros);

        ler.close();
    }
}
