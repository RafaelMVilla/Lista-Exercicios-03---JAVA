package classes;

public class AlturaEPesoIdeal {
    
    public String nome;
    public int idade;
    public char sexo;
    public double altura;

    public AlturaEPesoIdeal(String nome, int idade,char sexo, double altura){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
    }

    public void imprimirDados(){
        double pesoIdeal = calculoPesoIdeal();
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso ideal: " + pesoIdeal);
        System.out.println("------------------------");
    }

    public int verificarSexo(){

        if (sexo == 'M' || sexo == 'm') {
            return 0;
        } else if (sexo == 'F' || sexo == 'f') {
            return 1;
        }
            return -1;
    }

    public double calculoPesoIdeal(){
        altura = altura / 100;
        double pesoIdeal = 0.0;
    
        if (sexo == 'M' || sexo == 'm') {
            if (altura > 1.7) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (altura > 1.5) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        }
    
        return pesoIdeal;
    }
    
}