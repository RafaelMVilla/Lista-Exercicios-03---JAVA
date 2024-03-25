package classes;

public class Custo {
    
    public double precoCusto;
    public double acrescimo;

    public double calcularPrecofinal(){

        double precofinal = precoCusto * ( 1.0 + (acrescimo / 100.0));

        return precofinal;
    }

    
}