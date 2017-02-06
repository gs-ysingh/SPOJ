import java.util.Scanner;

/**
 * Created by YSingh on 06/02/17.
 */
public class EIGHTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while (cases > 0) {
            long n = scanner.nextLong();
            System.out.println(192 + (n - 1) * 250);
            cases--;
        }
    }
}
