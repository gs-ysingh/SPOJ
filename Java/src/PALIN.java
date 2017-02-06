import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by YSingh on 06/02/17.
 */
public class PALIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            BigInteger k = scanner.nextBigInteger();
            System.out.println(getNextPalindrome(k));
            n--;
        }
    }

    private static BigInteger getNextPalindrome(BigInteger k) {
        while (true) {
            k = k.add(BigInteger.ONE);
            if(k.compareTo(reverseFast(k)) == 0) {
                break;
            }
        }
        return k;
    }

    private static BigInteger reverseFast(BigInteger k) {
        BigInteger res = BigInteger.ZERO;
        while (k.compareTo(BigInteger.ZERO) > 0) {
            res = res.multiply(new BigInteger("10")).add(k.mod(new BigInteger("10"))) ;
            k = k.divide(new BigInteger("10"));
        }
        return res;
    }
}
