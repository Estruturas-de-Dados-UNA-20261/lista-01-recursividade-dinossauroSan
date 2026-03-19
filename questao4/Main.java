package questao4;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = teclado.nextInt();
        Vetor vetor = new Vetor(tamanho);
        vetor.imprimirVetor(0);
        int maiorElemento = vetor.obterMaiorElemento(0, 0);
        System.out.println("\nO maior elemento do vetor é: " + maiorElemento);




    }


}