
/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.
 */

package classetesteaprender;

import java.util.Scanner;

// import classes.CalculosMatematicos;
// import classetesteaprender.Equipamento;
// import classetesteaprender.PersonagemLol;


public class ExercicioExemplo {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        // CalculosMatematicos objCalculosMatematicos = new CalculosMatematicos();

        // System.out.println("Digite um numero: ");
        // objCalculosMatematicos.numero1 = ler.nextDouble();

        // System.out.println("Digite um numero: ");
        // objCalculosMatematicos.numero2 = ler.nextDouble();

        // System.out.println("Soma: " + objCalculosMatematicos.calculoSomar());
        // System.out.println("----------------------------------");
        
        // objCalculosMatematicos.numero2 = 2;
        
        // System.out.println("Multiplicação: " + objCalculosMatematicos.calculoMultiplicar());

        // System.out.println("Soma: " + objCalculosMatematicos.calculoSomar());

        // System.out.println("-----------------------");


        // // double valorX = ler.nextDouble();
        // // double valorY = ler.nextDouble();





        // System.out.println("Soma com Parametros: " + objCalculosMatematicos.calculoSomar(ler.nextDouble(),ler.nextDouble()));

        // System.out.println("-----------------------");

        // System.out.println("Multiplicação com Parametros: " + objCalculosMatematicos.calculoMultiplicar(ler.nextDouble(),ler.nextDouble()));

        // System.out.println("Digite um número: ");

        System.out.println("-----------------------------");
        System.out.println("----------LOL---------");


        // CRIACAO DA ESPADA SEM CONSTRUTOR
        PersonagemLol p1 = new PersonagemLol("Fizz", 100,300,450,100,10);

        // OU ABAIXO..

        p1.nome = "Fizz";
        p1.forca = 100;
        p1.mana = 300;
        p1.velocidade = 450;
        p1.xp = 100;
        p1.dano = 10;

        
        // Equipamento espada = new Equipamento();

        // espada.nome = "Espada De Fogo";
        // espada.armadura = 30;
        // espada.dano = 10;
        // espada.forca = 20;

        // CRIACAO DA ESPADA COM CONSTRUTOR
        Equipamento espada = new Equipamento("Espada De Fogo", 10, 30, 20);




        p1.correr();

        p1.equipar(espada);

        p1.atacar();

        System.out.println("Nome: " + p1.nome);
        System.out.println("Força: " + p1.forca);
        System.out.println("Dano: " + p1.dano);
        System.out.println("Velocidade: " + p1.velocidade);



        ler.close();
    }
}
