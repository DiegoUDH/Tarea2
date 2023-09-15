public class ejercicio4 {
    private int filasA;
    private int columnasA;
    private int filasB;
    private int columnasB;
    private int[][] matrizA;
    private int[][] matrizB;

    // Constructor para crear matrices A y B con las dimensiones especificadas
    public ejercicio4(int filasA, int columnasA, int filasB, int columnasB) {
        if (columnasA != filasB) {
            throw new IllegalArgumentException("El número de columnas de A debe ser igual al número de filas de B para multiplicar las matrices.");
        }

        this.filasA = filasA;
        this.columnasA = columnasA;
        this.filasB = filasB;
        this.columnasB = columnasB;

        matrizA = new int[filasA][columnasA];
        matrizB = new int[filasB][columnasB];
    }

    // Método para establecer un valor en una posición específica de la matriz A
    public void setValorMatrizA(int fila, int columna, int valor) {
        matrizA[fila][columna] = valor;
    }

    // Método para establecer un valor en una posición específica de la matriz B
    public void setValorMatrizB(int fila, int columna, int valor) {
        matrizB[fila][columna] = valor;
    }

    // Método para realizar la multiplicación de matrices
    public int[][] multiplicar() {
        if (columnasA != filasB) {
            throw new IllegalArgumentException("El número de columnas de A debe ser igual al número de filas de B para multiplicar las matrices.");
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Método para imprimir una matriz
    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ejercicio4 matrizMultiplicacion = new ejercicio4(3, 2, 2, 3);

        // Llenar las matrices A y B con valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizMultiplicacion.setValorMatrizA(i, j, i + j);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizMultiplicacion.setValorMatrizB(i, j, i - j);
            }
        }

        System.out.println("Matriz A:");
        matrizMultiplicacion.imprimirMatriz(matrizMultiplicacion.matrizA);

        System.out.println("Matriz B:");
        matrizMultiplicacion.imprimirMatriz(matrizMultiplicacion.matrizB);

        // Multiplicar las matrices
        int[][] resultado = matrizMultiplicacion.multiplicar();

        System.out.println("Matriz Resultante:");
        matrizMultiplicacion.imprimirMatriz(resultado);
    }
}