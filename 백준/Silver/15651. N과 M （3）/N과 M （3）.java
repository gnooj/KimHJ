import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean visit[];
    static int result[];
    // static int start = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 2];
        result = new int[M + 1];
        BT(0);
        result[0] = 0;
        System.out.print(sb);
    }

    static void BT(int level) {

        if (level == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
                sb.append("\n");

            return;
        }
        // visit[level] = true;
        // visit[a + 1] = false;
        for (int i = 1; i <= N; i++) {
            // visit[i] = true;
            // if (!visit[i]) {
            // visit[i] = true;
            result[level] = i;
            BT(level + 1);
            // visit[i] = false;
            // }

        }

    }

}