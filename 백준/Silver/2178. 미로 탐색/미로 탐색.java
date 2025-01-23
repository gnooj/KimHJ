import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] visit = new int[101][101];
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int n;
    static int m;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        bfs(0, 0);
        System.out.println(visit[n - 1][m - 1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });
        visit[x][y] = 1;
        while (!q.isEmpty()) {
            int temp[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = temp[0] + dx[i];
                int nexty = temp[1] + dy[i];
                if (nextx > -1 && nexty > -1 && nextx < n && nexty < m &&
                        map[nextx][nexty] != '0' && visit[nextx][nexty] == 0) {
                    q.add(new int[] { nextx, nexty });
                    visit[nextx][nexty] = visit[temp[0]][temp[1]] + 1;
                }
            }
        }
    }
}
