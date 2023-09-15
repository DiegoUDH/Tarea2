public class ejercicio3 {
    private double radio;
    private double altura;

    // Constructor para crear un cilindro con radio y altura especificados
    public ejercicio3(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    // Método para calcular el área de la base del cilindro (círculo)
    public double calcularAreaBase() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área lateral del cilindro
    public double calcularAreaLateral() {
        return 2 * Math.PI * radio * altura;
    }

    // Método para calcular el área total del cilindro
    public double calcularAreaTotal() {
        return 2 * calcularAreaBase() + calcularAreaLateral();
    }

    public static void main(String[] args) {
        ejercicio3 cilindro = new ejercicio3(5.0, 10.0);

        double areaBase = cilindro.calcularAreaBase();
        double areaLateral = cilindro.calcularAreaLateral();
        double areaTotal = cilindro.calcularAreaTotal();

        System.out.println("Área de la base del cilindro: " + areaBase);
        System.out.println("Área lateral del cilindro: " + areaLateral);
        System.out.println("Área total del cilindro: " + areaTotal);
    }
}