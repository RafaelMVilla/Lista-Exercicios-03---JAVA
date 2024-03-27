
/*
Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
Infantil A = 5 - 7 anos
Infantil B = 8 - 10 anos
juvenil A = 11- 13 anos
juvenil B = 14 - 17 anos
Sênior = 18 - 25 anos
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.
 */

package lista;

import java.util.Scanner;

import classes.IdadeNadador;

public class Exercicio21 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        IdadeNadador objIdadeNadador = new IdadeNadador(idade);

        System.out.println("-----------------------");

        
        System.out.println("Sua idade: " + objIdadeNadador.idade);
        
        if (objIdadeNadador.calculoCategoria() == -1) {
            
            System.out.println("Idade fora da faixa etária.");

        }else if (objIdadeNadador.calculoCategoria() == 0) {
            
            System.out.println("Classificado-a para: Infantil A");

        }else if (objIdadeNadador.calculoCategoria() == 1) {
            
            System.out.println("Classificado-a para: Infantil B");

        }else if (objIdadeNadador.calculoCategoria() == 2) {
            
            System.out.println("Classificado-a para: Infantil C");

        }else if (objIdadeNadador.calculoCategoria() == 3) {
            
            System.out.println("Classificado-a para: Infantil D");
        }else {
            
            System.out.println("Classificado-a para: Sênior");

        }

        ler.close();
    }
}
