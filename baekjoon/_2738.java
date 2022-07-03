package baekjoon;

import java.util.Scanner;

public class _2738 {
    static Scanner sc = new Scanner(System.in);

    static int n = sc.nextInt();
    static int m = sc.nextInt();

    public static void main(String[] args) {
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        /*for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                B[i][j] = sc.nextInt();
            }
        }*/

        array(A);
        array(B);

        for (int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(A[i][j] + B[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void array(int[][] array) {
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
}