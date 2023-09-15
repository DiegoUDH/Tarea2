public class ejercicio5 {
    private double a;
    private double b;
    private int n;

    // Constructor para crear un binomio con los valores de a, b y n
    public ejercicio5(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    // Método para calcular el coeficiente binomial C(n, k)
    private int coeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return coeficienteBinomial(n - 1, k - 1) + coeficienteBinomial(n - 1, k);
    }

    // Método para calcular el término k del binomio (a + b)^n
    private double calcularTermino(int k) {
        int coeficiente = coeficienteBinomial(n, k);
        double termino = coeficiente * Math.pow(a, n - k) * Math.pow(b, k);
        return termino;
    }

    // Método para calcular la expansión completa del binomio (a + b)^n
    public void calcularExpansion() {
        for (int k = 0; k <= n; k++) {
            double termino = calcularTermino(k);
            System.out.println("Término " + k + ": " + termino);
        }
    }

    public static void main(String[] args) {
        ejercicio5 binomio = new ejercicio5(2.0, 3.0, 4);

        System.out.println("Expansión del binomio (a + b)^4:");
        binomio.calcularExpansion();
    }
}

