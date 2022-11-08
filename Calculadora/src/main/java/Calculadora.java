public class Calculadora {

    public int somar(int i, int j) {
        return i + j;
    }

    public int subtrair(int i, int j) {
        return i - j;
    }

    public int multiplicar(int i, int j) {
        return i * j;
    }

    public double dividir(double i, double j) {
        if (j == 0)
            throw new IllegalArgumentException("Divisão por 0");
        return i / j;
    }

}
