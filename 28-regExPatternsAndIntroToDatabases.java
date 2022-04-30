import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String emailRegEx = ".+@gmail.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String name = scan.next();
            String email = scan.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                list.add(name);
            }
        }

        Collections.sort(list);
        for (String element: list) {
            System.out.println(element);
        }
        scan.close();
    }
}
