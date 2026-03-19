package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inversor de Sequência numérica\nDigite a quantidade de números");
        int quantidade = teclado.nextInt();

        InversaoSequencia inversao = new InversaoSequencia();
        inversao.inverterSequencia(quantidade);
    }
}