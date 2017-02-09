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
        int mid = k.length() / 2;
        int i = 0;
        int j = 0;
        if(k.length() % 2 == 0) {
            i = mid - 1;
            j = mid;
        }
        else {
            i = mid - 1;
            j = mid + 1;
        }

        //save i and j, we will need it again

        int m = i;
        int n = j;

        while (i > 0 && j < k.length() && k.charAt(i) == k.charAt(j)) {
            i--;
            j++;
        }

        if(i == 0 && j == k.length()) {
            i = m;
            j = n;
            return getNextString(k, i, j, mid);
        }
        else {
            //Case 2.1
            if((int)k.charAt(i) > (int)k.charAt(j)) {
                StringBuilder sb = new StringBuilder(k);
                while (i >= 0) {
                    sb.setCharAt(j, sb.charAt(i));
                    i--;
                    j++;
                }
                return sb.toString();
            }
            else {
                i = m;
                j = n;
                return getNextString(k, i, j, mid);
            }
        }

    }

    private static String getNextString(String k, int i, int j, int mid) {
        int val = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder(k);

        if(k.length() % 2 == 0) {
            mid = k.length() / 2 - 1;
            carry = 1;
        }
        else {
            mid = k.length() / 2;
            val = Character.getNumericValue(sb.charAt(mid)) + 1;
            carry = val / 10;
            val = val % 10;
            sb.setCharAt(mid, Character.forDigit(val, 10));
        }

        while (i >= 0) {
            val = Character.getNumericValue(sb.charAt(i))+ carry;
            carry = val / 10;
            val = val % 10;
            sb.setCharAt(i, Character.forDigit(val, 10));
            sb.setCharAt(j, Character.forDigit(val, 10));
            i--;
            j++;
        }
        return sb.toString();
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

}
