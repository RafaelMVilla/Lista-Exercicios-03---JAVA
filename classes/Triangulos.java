package classes;

public class Triangulos {
    
    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulos(double lado1, double lado2, double lado3){

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int verificarTriangulo(){

        if ((lado1 == lado2 && lado2 != lado3 ) || (lado2 == lado3 && lado3 != lado1) || (lado3 == lado1 && lado1 != lado2)) {
            
            return 1;

        } else if (lado1 == lado2 && lado2 == lado3) {
            
            return 0;

        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            
            return -1;
        }
            return 2;
    }
}
