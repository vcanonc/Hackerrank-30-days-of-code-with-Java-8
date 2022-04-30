import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        
        int num;
        double decimal;
        String text;
        
        num = scan.nextInt();
        decimal = scan.nextDouble();
        scan.nextLine();
        text = scan.nextLine();

        System.out.println(i + num);
        System.out.println(d + decimal);
        System.out.println(s + text);

        scan.close();
    }
}