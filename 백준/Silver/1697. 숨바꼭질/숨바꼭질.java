import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] visit = new int[100001];
    static int K;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }

    }

    static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        visit[num] = 1;
        q.add(num);

        while (!q.isEmpty()) {
            int temp = 0;

            int n = q.poll();

            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    temp = n - 1;
                } else if (i == 1) {
                    temp = n + 1;
                } else {
                    temp = n * 2;
                }
                if (temp == K) {
                    System.out.println(visit[n]);
                    return;
                }

                if (temp >= 0 && temp < visit.length && visit[temp] == 0) {
                    q.add(temp);
                    visit[temp] = visit[n] + 1;
                }
            }

        }

    }

}