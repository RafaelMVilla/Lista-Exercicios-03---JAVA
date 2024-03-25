package classes;

public class FabricaCarro {
    
    public double custofabrica;
    public double custoconsumidor;
    public double percentagemdistr = 0.28;
    public double impostos = 0.45;

    public double calcularCustoCarro(){
        return custoconsumidor = (custofabrica * (1 + impostos)) * (1 + percentagemdistr);
    }
}

