package classes;

public class IntervaloNumeros {
    
    public int valor[] = new int[10];
    public int contador = 0;

    public int contaVerificar(){
        for (int i = 0; i < 10  ; i++) {
            
            if (valor[i] >= 10 && valor[i] <= 150) {
                contador += 1;
            }
        }
        return contador;
    }
}
