package questao2;
import java.util.Scanner;
public class InversaoSequencia {
    Scanner teclado = new Scanner(System.in);
    public InversaoSequencia() {
        
    }

    public void inverterSequencia(int quantidade) {
        if (quantidade == 0) {
            return;
        } else {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            inverterSequencia(quantidade - 1);
            System.out.print(numero + " ");
        }
    }
}