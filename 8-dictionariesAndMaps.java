import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int phone;
        int n = scan.nextInt();
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        if ((n >= 1) && (n <= 100000)) {
            for (int i=0; i<n; i++) {
                name = scan.next();
                phone = scan.nextInt();
                dictionary.put(name, phone);
            }
        }

        while (scan.hasNext()) {
            String key = scan.next();
            if (dictionary.get(key) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(key + "=" + dictionary.get(key));
            }
        }
        scan.close();
    }
}