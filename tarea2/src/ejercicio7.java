public class ejercicio7 {
    // Método para realizar la operación especificada
    public double calcular(double numero1, double numero2, char operador) {
        switch (operador) {
            case '+':
                return numero1 + numero2;
            case '-':
                return numero1 - numero2;
            case '*':
                return numero1 * numero2;
            case '/':
                if (numero2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                return numero1 / numero2;
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
    }

    public static void main(String[] args) {
        ejercicio7 calculadora = new ejercicio7();

        double resultado1 = calculadora.calcular(24.0, 9.0 + 3.0, '/');
        double resultado2 = calculadora.calcular(resultado1, 4.0, '*');

        System.out.println("Resultado: " + resultado2);
    }
}
