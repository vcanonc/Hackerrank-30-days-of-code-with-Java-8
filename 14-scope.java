import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public void computeDifference() {
        int max = 0;
        for (int i=0; i<elements.length-1; i++) {
            for (int j=i+1; j<elements.length; j++) {
                max = Math.abs(elements[i] - elements[j]);
                if (max > maximumDifference) {
                    maximumDifference = max;
                }
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
