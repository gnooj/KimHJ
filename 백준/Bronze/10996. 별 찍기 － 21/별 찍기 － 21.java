import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        if (T == 1) {
            System.out.println("*");
            return;
        } else {
            if (T % 2 != 0) {
                for (int j = 0; j < T; j++) {
                    for (int i = 0; i < T / 2 + 1; i++) {
                        sb.append("* ");
                    }
                    sb.append("\n");
                    for (int i = 0; i < T / 2; i++) {
                        sb.append(" *");
                    }
                    sb.append("\n");
                }

            } else {
                for (int j = 0; j < T; j++) {
                    for (int i = 0; i < T / 2; i++) {
                        sb.append("* ");
                    }
                    sb.append("\n");
                    for (int i = 0; i < T / 2; i++) {
                        sb.append(" *");
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);

    }

}