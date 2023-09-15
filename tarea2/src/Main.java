public class Main {
    public static void main(String[] args) {
        // Crear instancias de OperacionMatematica
        ejercicio1 operacion1 = new ejercicio1(10.0, 5.0);
        ejercicio1 operacion2 = new ejercicio1(8.0, 2.0);

        // Realizar operaciones y mostrar resultados
        System.out.println("Resultado de la suma: " + operacion1.sumar());
        System.out.println("Resultado de la resta: " + operacion1.restar());
        System.out.println("Resultado de la multiplicación: " + operacion1.multiplicar());

        try {
            System.out.println("Resultado de la división: " + operacion1.dividir());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("---------------");

        System.out.println("Resultado de la suma: " + operacion2.sumar());
        System.out.println("Resultado de la resta: " + operacion2.restar());
        System.out.println("Resultado de la multiplicación: " + operacion2.multiplicar());

        try {
            System.out.println("Resultado de la división: " + operacion2.dividir());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
