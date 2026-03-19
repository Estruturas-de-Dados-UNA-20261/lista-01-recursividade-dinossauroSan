package questao3;

public class ConversorBinario {
    
    public static String converterDecimalParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        } else if (numero == 1) {
            return "1";
        } else {
            return converterDecimalParaBinario(numero / 2) + (numero % 2);
        }
    }
}