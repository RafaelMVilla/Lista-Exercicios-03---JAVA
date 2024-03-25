package classes;

public class IntervaloNumeros {
    
    public int valor[] = new int[80];
    public int contador = 0;

    public int contaVerificar(){
        for (int i = 0; i < 80; i++) {
            
            if (valor[i] >= 10 && valor[i] <= 150) {
                contador += 1;
            }
        }
        return contador;
    }
}
