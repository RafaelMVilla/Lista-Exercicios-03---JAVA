package classes;

public class Maioridade {

    public int contador;
    public String nome[];
    public int idade[];
    public int maioridade;

    public Maioridade(int contador) {

        this.contador = contador;
        this.nome = new String[contador];
        this.idade = new int[contador];
    }

    public  int verificarMaioridade(int index){

            if (idade[index] >= 18) {
                maioridade = 1;
            } else {
                maioridade = 0;
            }
    
        return maioridade;
    }
}
