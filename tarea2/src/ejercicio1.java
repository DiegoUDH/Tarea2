public class ejercicio1 {
    private double numero1;
    private double numero2;

    // Constructor
    public ejercicio1(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para realizar la suma
    public double sumar() {
        return numero1 + numero2;
    }

    // Método para realizar la resta
    public double restar() {
        return numero1 - numero2;
    }

    // Método para realizar la multiplicación
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método para realizar la división
    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numero1 / numero2;
    }
}

