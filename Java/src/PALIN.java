import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by YSingh on 06/02/17.
 */
public class PALIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            String k = scanner.nextLine();
            System.out.println(getNextPalindrome(k));
            n--;
        }
    }

    private static String getNextPalindrome(String k) {
        //Case 1: All 9's
        if(allNine(k)) {
            //999 - 1001
            StringBuilder sb = new StringBuilder("1");
            int count = k.length() - 1;
            while (count > 0) {
                sb.append("0");
                count--;
            }
            sb.append("1");
            return sb.toString();
        }

        //Step 1: Point

        //Case 2:


        return reverseString(k);
    }

    private static boolean allNine(String k) {
        int flag = 0;
        for (int i = 0; i < k.length(); i++) {
            if(k.charAt(i) != '9') {
                flag = 1;
            }
        }

        if(flag == 0) {
            return true;
        }

        return false;
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
