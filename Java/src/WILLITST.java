import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by YSingh on 20/02/17.
 */
public class WILLITST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        System.out.println(willStop(number));
    }

    private static String willStop(BigInteger x) {
        if(x.and(x.subtract(BigInteger.ONE)).equals(BigInteger.ZERO)) {
            return "TAK";
        }

        return "NIE";
    }
}
