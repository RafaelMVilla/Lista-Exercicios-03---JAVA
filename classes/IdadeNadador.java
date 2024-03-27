package classes;

public class IdadeNadador {
    
    public int idade;
    public char verificador;


    public IdadeNadador(int idade){

        this.idade = idade;
    }

    public int calculoCategoria(){

        if (idade < 5 || idade > 25) {
            
            return -1;
        }else if (idade >= 5 && idade <= 7) {
            
            return 0;
        }else if (idade >= 8 && idade <= 10) {
            
            return 1;
        } else if (idade >= 11 && idade <= 13) {
            
            return 2;
        }else if (idade >= 14 && idade <= 17) {
            
            return 3;
        }else {
            return 4;
        }
    }
}
