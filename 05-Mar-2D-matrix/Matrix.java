//1. Create and print elements in matrix

import java.util.Scanner;

/**
 * Matrix
 */
public class Matrix {
    static void display(int[][] matrix,int r,int c)
    {
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++)
            System.out.print(matrix[i][j]+" "); 
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column length for a matrix creation...");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int [r][c];
        System.out.println("Insert element in matrix");
        for(int i = 0; i<r; i++)
        for(int j = 0; j<c; j++)
            matrix[i][j] = sc.nextInt();
            display(matrix, r, c);
            sc.close();
    }
}