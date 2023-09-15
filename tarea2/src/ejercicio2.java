public class ejercicio2 {
    private int filas;
    private int columnas;
    private int[][] datos;

    // Constructor para crear una matriz con las dimensiones especificadas
    public ejercicio2(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];
    }

    // Método para establecer un valor en una posición específica de la matriz
    public void setValor(int fila, int columna, int valor) {
        datos[fila][columna] = valor;
    }

    // Método para obtener el valor en una posición específica de la matriz
    public int getValor(int fila, int columna) {
        return datos[fila][columna];
    }

    // Método para sumar dos matrices
    public ejercicio2 sumar(ejercicio2 otraMatriz) {
        if (filas != otraMatriz.filas || columnas != otraMatriz.columnas) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas " +
                    "dimensiones para sumarlas.");
        }

        ejercicio2 resultado = new ejercicio2(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(i, j, datos[i][j] + otraMatriz.getValor(i, j));
            }
        }

        return resultado;
    }

    // Método para imprimir la matriz
    public void imprimir() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ejercicio2 matriz1 = new ejercicio2(3, 3);
        ejercicio2 matriz2 = new ejercicio2(3, 3);

        // Llenar las matrices con valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1.setValor(i, j, i + j);
                matriz2.setValor(i, j, i - j);
            }
        }

        System.out.println("Matriz 1:");
        matriz1.imprimir();

        System.out.println("Matriz 2:");
        matriz2.imprimir();

        // Sumar las matrices
        ejercicio2 resultado = matriz1.sumar(matriz2);

        System.out.println("Matriz Resultante:");
        resultado.imprimir();
    }
}
