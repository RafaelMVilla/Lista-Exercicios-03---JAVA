package classes;

public class NotasAluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public NotasAluno(String nome, double nota1, double nota2, double nota3){

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculoNotas (){

        double notaFinal = ((nota1 + nota2 + nota3) / 3);

        return notaFinal;
    }
}
