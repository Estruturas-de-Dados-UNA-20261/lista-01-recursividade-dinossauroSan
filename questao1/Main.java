package questao1;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Calculador de x elevado a n\nDigite o valor de x: ");
        double x = teclado.nextDouble();
        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();

        Potencia potencia = new Potencia();
        double resultado = potencia.calcularPotencia(x, n);
        System.out.println(x + " elevado a " + n + " é igual a: " + resultado);
        
    }
}