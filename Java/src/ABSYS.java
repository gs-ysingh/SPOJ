import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by YSingh on 22/02/17.
 */
public class ABSYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 2 * sc.nextInt();
        while (n >= 0) {
            String exp = sc.nextLine();
            if(!exp.equals("")) {
                System.out.println(getExp(exp));
            }
            n--;
        }
    }

    private static String getExp(String exp) {
        int pluxIndex = exp.indexOf('+');
        int equalIndex = exp.indexOf('=');

        String a = exp.substring(0, pluxIndex - 1);
        String b = exp.substring(pluxIndex + 2, equalIndex - 1);
        String c = exp.substring(equalIndex + 2);

        if(!a.matches("^-?\\d+$")) {
            return String.valueOf(Integer.parseInt(c) - Integer.parseInt(b)) + " + " + b + " = " + c;
        }

        if(!b.matches("^-?\\d+$")) {
            return a + " + " + String.valueOf(Integer.parseInt(c) - Integer.parseInt(a)) + " = " + c;
        }

        if(!c.matches("^-?\\d+$")) {
            return a + " + " + b + " = " + String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }

        return exp;
    }
}
