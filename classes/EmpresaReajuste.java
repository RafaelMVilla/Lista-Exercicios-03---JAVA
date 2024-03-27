package classes;

public class EmpresaReajuste {
    
    public double salarioMinimo;
    public double salarioFuncionario;
    public double salarioReajustado;


    public EmpresaReajuste(double salarioMinimo, double salarioFuncionario){

        this.salarioMinimo = salarioMinimo;
        this.salarioFuncionario = salarioFuncionario;
    }


    public double calcularSalario(){

            if (salarioFuncionario < (salarioMinimo * 3)) {
                
                salarioReajustado = salarioFuncionario * 1.50;
            } else if (salarioFuncionario > (salarioMinimo * 3) && salarioFuncionario < (salarioMinimo * 10)) {
                
                salarioReajustado = salarioFuncionario * 1.20;

            } else if (salarioFuncionario > (salarioMinimo * 10) && (salarioFuncionario < (salarioMinimo * 20))) {
                
                salarioReajustado = salarioFuncionario * 1.15;
                
            } else if (salarioFuncionario > (salarioMinimo * 20)) {
                
                salarioReajustado = salarioFuncionario * 1.10;
            }


        return salarioReajustado;
    }
}
