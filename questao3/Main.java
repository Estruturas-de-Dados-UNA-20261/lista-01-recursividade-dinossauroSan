package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Conversor de número decimal para binário\nDigite um número decimal: ");
        int numero = teclado.nextInt();
        String binario = ConversorBinario.converterDecimalParaBinario(numero);
        System.out.println("O número decimal " + numero + " em binário é: " + binario);
    }
}