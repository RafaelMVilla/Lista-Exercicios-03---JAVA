package classes;

public class Vendedor {
    
    public String nome;
    public double salariofixo;
    public double vendasMes;

    public double salariototal(){
        
        return (salariofixo + (vendasMes * 0.15));
    }
}
