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

        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(num / Q).append(" ");
            num = num % Q;
            sb.append(num / D).append(" ");
            num = num % D;
            sb.append(num / N).append(" ");
            num = num % N;
            sb.append(num / P).append("\n");

        }
        System.out.println(sb);
    }
}