import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boolean symmetric = true;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break outerLoop; 
                }
            }
        }
        System.out.println(symmetric ? "Symmetric" : "Not Symmetric");

        sc.close();
    }
}