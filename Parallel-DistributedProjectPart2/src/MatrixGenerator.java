import java.util.concurrent.ThreadLocalRandom;

/**
 * A utility class for generating n x n matrices filled with random integers.
 */
public class MatrixGenerator {

    /**
     * Generates an n x n matrix filled with random integers.
     *
     * @param n the size of the matrix (number of rows and columns)
     * @return a 2D array representing the generated matrix
     */
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = rand.nextInt();
            }
        }
        return matrix;
    }

    /**
     * Generates an n x n matrix filled with random integers within a specified range.
     *
     * @param n        the size of the matrix (number of rows and columns)
     * @param minValue the inclusive lower bound for random numbers
     * @param maxValue the exclusive upper bound for random numbers
     * @return a 2D array representing the generated matrix
     */
    public static int[][] generateMatrix(int n, int minValue, int maxValue) {
        int[][] matrix = new int[n][n];
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                row[j] = rand.nextInt(minValue, maxValue);
            }
        }
        return matrix;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = generateMatrix(n);

        // Print the generated matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}