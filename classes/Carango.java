package classes;

public class Carango {
    
    public double valorCarro;
    public double desconto;
    public double descontoAlcool;
    public double descontoGasolina;
    public double descontoDiesel;
    public double descontoParcial;
    public int tipo;

    public Carango(double valorCarro, int tipo){

        this.valorCarro = valorCarro;
        this.tipo = tipo;

    }


    public double calcularDesconto(){

        if (tipo == 1) {
            desconto = valorCarro * 0.25;

        }else if (tipo == 2) {
            desconto = valorCarro * 0.21;
            
        }else {
            desconto = valorCarro * 0.14;

        }
            
            return desconto;
          
    }

    // public double calcularDescontoParcial(){
    //     if (tipo == 1) {
    //         descontoParcial = 0.25;
            
    //     }else if (tipo == 2) {
    //         descontoParcial = 0.21;
            
    //     }else {
    //         descontoParcial = 0.14;
    //     }

    //         return descontoParcial;
    // }
}
