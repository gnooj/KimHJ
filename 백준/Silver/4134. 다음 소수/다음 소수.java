import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean t = true;
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            if (n == 0 || n == 1) {
                System.out.println(2);
                continue;
            }
            while (t) {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        t = false;
                        break;
                    }

                }
                if (t) {
                    System.out.println(n);
                    break;
                } else {
                    n++;
                    t = true;
                }
            }

        }
    }

}
