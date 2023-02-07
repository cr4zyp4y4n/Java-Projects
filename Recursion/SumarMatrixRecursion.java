import java.util.Random;

public class SumarMatrixRecursion {
    public static void main(String[] args) {
        int[][] matrix = new int[5][3];

        matrix = initMatriu(matrix,1,10);

        mostrarMatrix(matrix);

        int recuento = sumarMatrix(matrix, 0,0);

        System.out.println("La suma de los elementos de la matriz es: " + recuento);
    }

   private static int sumarMatrix(int[][] matrix, int fila, int columna) {
        if (fila == matrix.length){
            return 0;
        }else if (fila < matrix.length && columna == matrix[fila].length){
            return 0 + sumarMatrix(matrix, fila + 1,0);
        } else {
            return matrix[fila][columna] + sumarMatrix(matrix, fila, columna + 1);
        }
    }

    public static int[][] initMatriu(int[][] matrix, int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = intAleatori(min,max);
            }
        }
        return matrix;
    }

    public static int intAleatori(int min, int max) {
        Random random = new Random();
        return random.nextInt((max + 1) - min) + min;
    }

    public static void mostrarMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "  );
            }
        }
    }
}