
/*
Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isóscele;
Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.
 */

package lista;

import java.util.Scanner;

import classes.Triangulos;

public class Exercicio19 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado1 = ler.nextDouble();

        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado2 = ler.nextDouble();


        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado3 = ler.nextDouble();

        Triangulos objTriangulos = new Triangulos(lado1, lado2, lado3);


        if (objTriangulos.verificarTriangulo() == 1 ) {
            System.out.println("1º Lado: " + objTriangulos.lado1);
            System.out.println("2º Lado: " + objTriangulos.lado2);
            System.out.println("3º Lado: " + objTriangulos.lado3);
            System.out.println("O seu triâgulo é isóceles.");


        }else if (objTriangulos.verificarTriangulo() == 0) {
            System.out.println("1º Lado: " + objTriangulos.lado1);
            System.out.println("2º Lado: " + objTriangulos.lado2);
            System.out.println("3º Lado: " + objTriangulos.lado3);
            System.out.println("O seu triâgulo é equilátero e isóceles.");
            
        }else if (objTriangulos.verificarTriangulo() == -1) {
            System.out.println("1º Lado: " + objTriangulos.lado1);
            System.out.println("2º Lado: " + objTriangulos.lado2);
            System.out.println("3º Lado: " + objTriangulos.lado3);
            System.out.println("O seu triâgulo é escaleno.");
            
        }

        ler.close();
    }
}
