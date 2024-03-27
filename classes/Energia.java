package classes;

public class Energia {
    

    public int dias;
    public int tipo;
    public double resultado;


    public Energia(int dias, int tipo){

        this.dias = dias;
        this.tipo = tipo;
    }

    public double calcularEnergia(){

        if (tipo == 1) {
            
            resultado = 0.60 * (dias * 24);

        }else if (tipo == 2) {

            resultado = 0.48 * (dias * 24);

        }else {

            resultado = 1.29 * (dias * 24);
        }
        return resultado;
    }
}
