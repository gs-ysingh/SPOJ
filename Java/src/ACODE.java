import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by YSingh on 17/02/17.
 */
public class ACODE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String value = sc.nextLine();
            if(value.equals("0") ) {
                break;
            }
            System.out.println(getTotalDecoding(value));
        }
    }

    private static int getTotalDecoding(String value) {
        Map<String, Integer> map = new HashMap<>();
        map.put("0", 0);

        for (int i = 1; i < 10; i++) {
            map.put(String.valueOf(i), 1);
        }

        String [] arr = value.split("");

        return 0;
    }
}
