package classes;

public class NivelProfessor {
    
    public int horas;
    public int nivel;
    public double salario;

    public NivelProfessor(int nivel, int horas){

        this.nivel = nivel;
        this.horas = horas;
    }

    public double calculoSalarioProfessor(){

        if (nivel == 1) {
            
            salario = horas * 12;
        } else if (nivel == 2) {
            
            salario = horas * 17;
        } else {
            
            salario = horas * 25;
        }
        return salario;
    }
}
