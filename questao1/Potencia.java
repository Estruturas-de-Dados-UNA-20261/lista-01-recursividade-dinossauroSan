package questao1;

public class Potencia {
    
    public Potencia() {
    }

    public double calcularPotencia(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * calcularPotencia(x, n - 1);
        } else {
            return (1 / x) * calcularPotencia(x, n + 1);
        }


    }
}