package classes;

public class Cotacao {
    
    public double real;
    public double cotacao;

    public double dolar(){
        return (real / cotacao);
    }
}
