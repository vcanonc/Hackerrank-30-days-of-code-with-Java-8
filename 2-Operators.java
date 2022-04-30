import java.util.Scanner;

class Result {
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double tip = (mealCost * tipPercent) / 100;
        double tax = (mealCost * taxPercent) / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println(totalCost);
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost;
        int tipPercent;
        int taxPercent;
        
        mealCost = scan.nextDouble();
        tipPercent = scan.nextInt();
        taxPercent = scan.nextInt();
        scan.close();
        
        Result.solve(mealCost, tipPercent, taxPercent);
    }
}