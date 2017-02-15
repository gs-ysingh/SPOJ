import java.math.BigDecimal;
import java.util.Scanner;

public class HANGOVER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = Double.parseDouble(sc.nextLine());
        int n = 1;
        Double sum = (double) Math.round(100.0 / (n + 1)) / 100.0;
        int count = 0;
        while (value != 0.0) {
            count = 1;
            while (sum < value ) {
                count++;
                n++;
                sum = (double) Math.round((sum + (1 / (n + 1)))* 100.0 / 100.0);
            }
            System.out.println(count);
            value = Float.parseFloat(sc.nextLine());
        }

    }

    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
}
