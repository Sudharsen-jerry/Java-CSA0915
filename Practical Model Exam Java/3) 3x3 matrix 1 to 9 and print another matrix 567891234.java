public class Java {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix rearranged starting from 5:");
        printRearrangedMatrix(matrix, 5);
    }
    public static void printRearrangedMatrix(int[][] matrix, int startNumber) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == startNumber) {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[startRow][startCol] + " ");
                startCol++;
                if (startCol == cols) {
                    startCol = 0;
                    startRow++;
                }
                if (startRow == rows) {
                    startRow = 0;
                }
            }
            System.out.println();
        }
    }
}
