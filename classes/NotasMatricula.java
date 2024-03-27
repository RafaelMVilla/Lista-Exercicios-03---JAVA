package classes;

public class NotasMatricula {
    
    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;
    public double nota3;
    public double resultado;

    public NotasMatricula(String nome, int matricula, double nota1, double nota2, double nota3){
        
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculoMedia(){

        resultado = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);

        return resultado;
    }

    
}
