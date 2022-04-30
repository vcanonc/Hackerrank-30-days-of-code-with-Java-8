import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i=0; i<t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int max = 0;

            for (int j=1; j<n; j++) {
                for (int l=j+1; l<=n; l++) {
                    int h = j & l;
                    if (h < k && max < h) {
                        max = h;
                    }
                }
            }
            System.out.println(max);
        }
        scan.close();
    }
}
