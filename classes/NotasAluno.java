package classes;

public class NotasAluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculoNotas (){

        double notaFinal = ((nota1 + nota2 + nota3) / 3);

        return notaFinal;
    }
}
