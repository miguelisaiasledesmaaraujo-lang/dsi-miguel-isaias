
package aula04;

public class ExemploVariavel {
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 67;
        int n3 = 61;
        float precoComida = 2.50f;
        float precoBebida = 3.50f;
        
        float custoTotal = precoComida + precoBebida;
        int numeroTotal = n1 + n2 + n3;
       
        float totalCompleto = numeroTotal * custoTotal;
        System.out.println("Total: " + totalCompleto);
    }
}
