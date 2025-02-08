import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int map[][];
    static int dx[] = { 0, 0, 1, -1 };
    static int dy[] = { 1, -1, 0, 0 };
    static boolean visit[][];
    static int result = 0;
    static int R = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // StringBuilder sb = new StringBuilder();

        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    bfs(i, j);
                }
            }
        }
        System.out.println(R);
        System.out.println(result);

    }

    public static void bfs(int x, int y) {

        R++;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] { x, y });
        visit[x][y] = true;
        if (map[x][y] == 1) {
            count++;
        }
        while (!q.isEmpty()) {
            int temp[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = temp[0] + dx[i];
                int nexty = temp[1] + dy[i];

                if (nextx > -1 && nexty > -1 && nextx < n && nexty < m && !visit[nextx][nexty]
                        && map[nextx][nexty] != 0) {
                    q.add(new int[] { nextx, nexty });
                    visit[nextx][nexty] = true;
                    count++;
                }
            }
        }
        if (count > result) {
            result = count;
        }
    }
}
