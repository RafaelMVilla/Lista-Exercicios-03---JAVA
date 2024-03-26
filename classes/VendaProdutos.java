package classes;

public class VendaProdutos {
    
    public double precoCusto;
    public double precoVenda;
    public int mediaProdutos;
    public int mediaTotal;

    public VendaProdutos(double precoCusto, double precoVenda){

        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public int calcularVenda(){

        if (precoCusto < precoVenda) {
            
            return 1;
        } else if (precoCusto == precoVenda) {
            return 0;
        } else {
            return -1;
        }
    }
}
