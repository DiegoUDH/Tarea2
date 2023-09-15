public class ejercicio8 {
    // Método para calcular el área de un círculo
    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área de un cuadrado
    public double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static void main(String[] args) {
        ejercicio8 figuras = new ejercicio8();

        double radioCirculo = 5.0;
        double ladoCuadrado = 4.0;

        double areaCirculo = figuras.calcularAreaCirculo(radioCirculo);
        double areaCuadrado = figuras.calcularAreaCuadrado(ladoCuadrado);

        double areaTotal = areaCirculo + areaCuadrado;

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Área total (círculo + cuadrado): " + areaTotal);
    }
}
