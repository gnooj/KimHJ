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
        int S = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int min = 0;
        int result = 0;
        for (int i = S; i <= E; i++) {
            if (i < 2) {
                continue;
            }

            boolean flag = true;
            int M = (int) Math.sqrt(i);
            for (int j = 2; j <= M; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        if (result == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
            System.out.println(min);
        }

    }
}