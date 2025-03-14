import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        System.out.println("Spiral order traversal:");
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move down

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move left

            // Traverse from right to left (if there's still a row left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move up
            }

            // Traverse from bottom to top (if there's still a column left)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move right
            }
        }
        System.out.println(); // New line for clean output
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        // Taking input for the matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix in spiral order
        printSpiral(matrix, rows, cols);
        sc.close();
    }
}
