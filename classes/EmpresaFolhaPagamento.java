package classes;

public class EmpresaFolhaPagamento {
    
    public String nome;
    public double salarioFuncionario;
    public double salarioMinimo;
    public double percReajuste;
    public double salarioReajustado;

    public EmpresaFolhaPagamento(String nome, double salarioFuncionario, double salarioMinimo, double percReajuste){

        this.nome = nome;
        this.salarioFuncionario = salarioFuncionario;
        this.salarioMinimo = salarioMinimo;
        this.percReajuste = percReajuste;
    }
    
    public double calcularReajuste() {
        double salarioReajustado = salarioFuncionario * (1 + percReajuste / 100);
        return salarioReajustado;
    }

    public double calcularAumentoFolha() {
        return calcularReajuste() - salarioFuncionario;
    }
}
