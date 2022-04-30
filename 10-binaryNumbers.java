import java.util.Scanner;

public class Solution {
    private static int binaryCounter(int decimal) {
        int counter = 0;
        int max = 0;

        if (decimal < 1) {
            return 0;
        }
        
        while (decimal > 0) {
            if (decimal % 2 == 1) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            }
            else {
                counter = 0;
            }
            decimal /= 2;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        if ((n >= 1) && (n <= 1000000)) {
            System.out.println(binaryCounter(n));
        }
        scan.close();
    }
}