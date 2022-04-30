import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nArray;
        int num = 0;
        nArray = scan.nextInt();
        int[] numbersArray = new int[nArray];
        
        if ((nArray >= 1) && (nArray <= 1000)){
            for (int i=0; i<=nArray-1; i++) {
                num = scan.nextInt();
                if ((num >= 1) && (num <= 10000)) {
                    numbersArray[i] = num;
                }
            }
            
            for (int j=nArray-1; j>=0; j--) {
                System.out.print(numbersArray[j] + " ");
            }
        }
        scan.close();
    }
}