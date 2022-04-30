import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        try {
            Integer number = Integer.parseInt(s);
            System.out.println(number);
        } 
        catch (NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }
        sc.close();
    }
}