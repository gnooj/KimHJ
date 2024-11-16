import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startP = Integer.parseInt(st.nextToken());
        int endP = Integer.parseInt(st.nextToken());

        boolean P[] = new boolean[endP + 1];

        P[1] = true;
        for (int i = 2; i <= endP; i++) {
            if (!P[i]) {
                if (i >= startP) {
                    System.out.println(i);
                }

            }
            for (int j = i * 2; j <= endP; j += i) {
                P[j] = true;
            }
        }
    }

}
