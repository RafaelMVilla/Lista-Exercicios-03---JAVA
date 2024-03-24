package classes;

public class Aluno {
    
    public String nome;
    public float nota1;
    public float nota2;
    public float nota3;

    public float media(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
