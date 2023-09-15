import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de Áreas");
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = input.nextDouble();
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = input.nextDouble();
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = input.nextDouble();

        double areaCuadrado = calcularAreaCuadrado(ladoCuadrado);
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        double areaCirculo = calcularAreaCirculo(radioCirculo);

        double areaTotal = areaCuadrado + areaTriangulo + areaCirculo;

        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área total (cuadrado + triángulo + círculo): " + areaTotal);

        input.close();
    }

    // Método para calcular el área de un cuadrado
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
