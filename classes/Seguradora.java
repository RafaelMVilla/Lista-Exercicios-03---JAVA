package classes;

public class Seguradora {
    
    public String nome;
    public int idade;
    public int grupoRisco;
    public int risco;


    public Seguradora(String nome, int idade, int grupoRisco){

        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public int verificarRisco(){

        // 17 - 20 ANOS
        if (idade >= 17 && idade <= 20 && grupoRisco == 1) {
            risco = 1;

        } else if (idade >= 17 && idade <= 20 && grupoRisco == 2) {
            risco = 2;
            
        } else if (idade >= 17 && idade <= 20 && grupoRisco == 3) {
            risco = 3;
        
        // 21 - 24 ANOS
        } else if (idade >= 21 && idade <= 24 && grupoRisco == 1) {
            risco = 2;
            
        } else if (idade >= 21 && idade <= 24 && grupoRisco == 2) {
            risco = 3;

        } else if (idade >= 21 && idade <= 24 && grupoRisco == 3) {
            risco = 4;
        
        // 25 - 34 ANOS
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 1) {
            risco = 3;
            
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 2) {
            risco = 4;
            
        } else if (idade >= 25 && idade <= 34 && grupoRisco == 3) {
            risco = 5;
        
        // 35 - 64 ANOS
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 1) {
            risco = 4;
            
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 2) {
            risco = 5;
            
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 3) {
            risco = 6;
            
        // 65 - 70 ANOS
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 1) {
            risco = 7;
            
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 2) {
            risco = 8;
            
        } else if (idade >= 35 && idade <= 64 && grupoRisco == 3) {
            risco = 9;
            
        }
        return risco;
    }
}
