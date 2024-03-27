package classes;

public class CarangoVelho {
    
    public double precoCarro;
    public double precoDesconto;
    public int verificador;
    public char opcao;

    public CarangoVelho(double precoCarro, int verificador){

        this.precoCarro = precoCarro;
        this.verificador = verificador;
    }
    

    public double  contaDesconto(){

        if (verificador <= 2000) {
            
            precoDesconto = precoCarro - (precoCarro * 0.12);
        }else if (verificador > 2000){
            precoDesconto = precoCarro - (precoCarro * 0.07);
        }

        return precoDesconto;
    }
}
