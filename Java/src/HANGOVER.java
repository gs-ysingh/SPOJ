import java.util.Scanner;

/**
 * Created by YSingh on 14/02/17.
 */
public class HANGOVER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float value = Float.parseFloat(sc.nextLine());
        int n = 1;
        float sum = (float)1 / (n + 1);
        int count = 0;
        while (value != 0.0) {
            count = 1;
            while (sum < value ) {
                count++;
                n++;
                sum = sum + ((float)1 / (n + 1));
            }
            System.out.println(count + " card(s)");
            value = Float.parseFloat(sc.nextLine());
            n = 1;
            sum = (float)1 / (n + 1);
        }

    }
}
