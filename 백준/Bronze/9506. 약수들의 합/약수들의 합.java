import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int temp = 0;
            int len = sb.length();
            sb.append(n + " = ");
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    temp += i;
                    sb.append(i);
                    if (i == n / 2) {
                        break;
                    }
                    sb.append(" + ");
                }

            }
            if (temp != n) {
                sb.setLength(len);
                sb.append(n + " is NOT perfect.").append("\n");
            } else {
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
}