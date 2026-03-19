package questao4;
import java.util.Scanner;

public class Vetor {
    private int[] vetor;
    Scanner teclado = new Scanner(System.in);

    public Vetor(int tamanho){
        this.vetor = new int[tamanho];
        if (tamanho > 0){
            gerarVetor(0, tamanho);
        }
    }

    public int[] gerarVetor(int indice,int tamanho){
        // 1. CASO BASE: Se o índice atual for igual ao tamanho, o vetor acabou.
        if (indice == tamanho) {
            return this.vetor;
        } else {
            System.out.println("Digite o valor para a posição [" + indice + "]:");
            this.vetor[indice] = teclado.nextInt();
            return gerarVetor(indice + 1, tamanho);
        }
        
    }

    public void imprimirVetor(int indice) {
        if (indice == vetor.length) {
            return;
        } else {
            System.out.print("[" + vetor[indice] + "] ");
            imprimirVetor(indice + 1);
        }
    }

    public int obterMaiorElemento(int indice, int maior) {
        if (indice == vetor.length) {
            return maior;
        } else {
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
            return obterMaiorElemento(indice + 1, maior);
        }

    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    
}