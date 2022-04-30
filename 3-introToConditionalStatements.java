import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird");
            }
            else if (num >=6 && num <= 20) {
                System.out.println("Weird");
            }
            else if (num > 20) {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}