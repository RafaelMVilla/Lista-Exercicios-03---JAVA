package classes;

public class FuncionarioAbono {
    
    public String nome;
    public int idade;
    public char sexo;
    public double salario;
    public double salarioFinal;

    public FuncionarioAbono(String nome, int idade, char sexo, double salario){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int verificarSexo(){

        if (sexo == 'M' || sexo == 'm') {
            return 0;
        } else if (sexo == 'F' || sexo == 'f') {
            return 1;
        }
            return -1;
    }

    public double verificarSalarioSexoMasc(){

        if (verificarSexo() == 0 && idade >= 30) {
            
            salarioFinal = salario + 100;

        }else if (verificarSexo() == 0 && idade < 30) {
            
            salarioFinal = salario + 50;
        }
        return salarioFinal;
    }

    public double verificarSalarioSexoFem(){

        if (verificarSexo() == 1 && idade >= 30) {
            
            salarioFinal = salario + 200;

        }else if (verificarSexo() == 1 && idade < 30) {
            
            salarioFinal = salario + 80;
        }
        return salarioFinal;
    }

}
