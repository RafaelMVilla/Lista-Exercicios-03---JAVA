
/*
Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre nome e o seu peso ideal de acordo com as seguintes características da pessoa:
Sexo       Altura       Idade        Peso Ideal
                        <= 20       (72.7*h) - 58
            > 1.70      21 a 39      (72.7*h) - 53
                        >= 40       (72.7*h) - 45
 M     -----------------------------------------
           <= 1.70      <= 40       (72.7*h) - 50
                         > 40       (72.7*h) - 58
-------------------------------------------------
            > 1.50        ---     (62.1*h) - 44.7
F        <= 1.50      >= 35       (62.1*h) - 45
                         < 35       (62.1*h) - 49
 */

package lista;

import java.util.Scanner;

import classes.AlturaEPesoIdeal;

public class Exercicio23 {
    
    public static void executar(){
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
    
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();
    
        System.out.println("DIgite seu sexo (M / F): ");
        char sexo = ler.nextLine().charAt(0);
    
        System.out.println("Digite sua altura (cm): ");
        double altura = ler.nextDouble();
    
        AlturaEPesoIdeal objAlturaEPesoIdeal = new AlturaEPesoIdeal(nome, idade, sexo, altura);
        objAlturaEPesoIdeal.imprimirDados();
    
        ler.close();
    }
}
