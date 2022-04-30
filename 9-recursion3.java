import java.util.Scanner;

public class Solution {
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else if (n > 1) {
            return n * factorial(n - 1);
        }
        else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int result;
        n = scan.nextInt();
        if ((n >= 2) && (n <= 12)) {
            result = factorial(n);
            System.out.println(result);
        }
        scan.close();
    } 
}