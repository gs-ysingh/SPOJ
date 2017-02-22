import java.io.*;
import java.util.*;

/**
 * Created by YSingh on 22/02/17.
 */
public class STAMPS  {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        for (int j = 0; j < n; j++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            int total = Integer.parseInt(tokenizer.nextToken());
            int f = Integer.parseInt(tokenizer.nextToken());
            int [] arr = new int[f];
            tokenizer = new StringTokenizer(in.readLine());

            for (int i = 0; i < f; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(arr);
            out.printf("Scenario #%d:\n", j + 1);
            for (int i = f-1; i >= 0; i--) {
                total -= arr[i];
                if (total <= 0) {
                    out.println(f-i);
                    break;
                }
            }
            if (total > 0)
                out.println("impossible");
            out.println();
        }
        out.flush();
    }
}
