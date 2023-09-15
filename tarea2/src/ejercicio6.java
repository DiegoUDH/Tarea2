public class ejercicio6 {
    // Método para realizar una división
    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return dividendo / divisor;
    }

    // Método para realizar una suma
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        ejercicio6 calculadora = new ejercicio6();

        double numero1 = 10.0;
        double numero2 = 5.0;

        try {
            double resultadoDivision = calculadora.dividir(numero1, numero2);
            double resultadoSuma = calculadora.sumar(numero1, numero2);

            System.out.println("Resultado de la división: " + resultadoDivision);
            System.out.println("Resultado de la suma: " + resultadoSuma);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
