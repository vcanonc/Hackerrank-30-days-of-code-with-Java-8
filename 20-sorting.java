import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        int nChanges = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    nChanges++;
                }
            }
            if (nChanges == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + nChanges + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[n - 1]);

        scan.close();
    }
}
