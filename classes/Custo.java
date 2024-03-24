package classes;

public class Custo {
    
    public double precoCusto;
    public double acrescimo;

    public double calcularPrecofinal(){

        double precofinal = precoCusto * ( 1.0 + (acrescimo / 100.0));

        return precofinal;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}