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
        BT(0, 1);
        result[0] = 0;

    }

    // 전 level보다 큰 수만 false해주기?
    // 동 level에 있는 수는 그대로 true
    static void BT(int level, int a) {

        if (level == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            return;
        }
        // visit[level] = true;
        // visit[a + 1] = false;
        for (int i = a; i <= N; i++) {
            // visit[i] = true;
            if (!visit[i]) {
                visit[i] = true;
                result[level] = i;
                BT(level + 1, i);
                visit[i] = false;
            }

        }

    }

}