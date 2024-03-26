package classes;

public class Exercito {
    
    public String nome;
    public int idade;
    public int qtdePessoas;
    public char saude;
    public int verificador;

    public Exercito(String nome, int idade, char saude){

        this.nome = nome;
        this.idade = idade;
        this.saude = saude;

    }

    public int verificarSaude(){

        if (saude == 'S' || saude == 's') {
            verificador = 1;

        } else if (saude == 'N' || saude == 'n') {
            verificador = 0;

        }
        return verificador;
    }
}
