import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int count = 0;
    static int M;
    static boolean[] visit;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];
        arr = new int[N + 1];
        // HashMap<
        recursion(0, 1, 0);
        System.out.println(sb);
    }

    static void recursion(int level, int idx, int vn) {
        if (level == M) {
            for (int i = 1; i <= M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            idx--;
            level--;
            visit[vn] = false;
            return;
        }
        visit[vn] = true;
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                arr[idx] = i;
                recursion(level + 1, idx + 1, i);
            }
        }
        visit[vn] = false;

    }

}