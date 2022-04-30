import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int total = 0;
        int maximumSum = 0;

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        maximumSum = -9 * 9;
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if ((i + 2 < 6) && (j + 2 < 6)) {
                    total = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] 
                    + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] 
                    + matrix[i+2][j+2];
                    if (total >= maximumSum) {
                        maximumSum = total;
                    }
                }
            }
        }
        System.out.println(maximumSum);
        scan.close();
    }
}