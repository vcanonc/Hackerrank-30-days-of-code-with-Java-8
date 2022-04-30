import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % 2 == 0) {
            return false;
        }
        for (int i=3; i<=Math.sqrt(n)+1; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] numbers = new int[t];
        for (int i=0; i<t; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i=0; i<t; i++) {
            if (isPrime(numbers[i])) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
        scan.close();
    }
}