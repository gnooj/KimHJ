import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] visit = new int[1001][1001];
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int n;
    static int m;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        int Px = 0;
        int Py = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 2) {
                    Px = i;
                    Py = j;
                } else if (num == 0) {
                    map[i][j] = -1;
                } else {
                    map[i][j] = num;
                }

            }
        }

        bfs(Px, Py);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == Px && j == Py) {
                    sb.append(0 + " ");
                } else if (map[i][j] == -1) {
                    sb.append(0 + " ");
                } else if (visit[i][j] == 0) {
                    sb.append(-1 + " ");
                } else {
                    sb.append(visit[i][j] + " ");
                }

            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });
        visit[x][y] = 0;
        while (!q.isEmpty()) {
            int next[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = next[0] + dx[i];
                int nexty = next[1] + dy[i];

                if (nextx > -1 && nexty > -1 && nextx < n && nexty < m &&
                        visit[nextx][nexty] == 0) {
                    if (map[nextx][nexty] != -1) {
                        visit[nextx][nexty] = visit[next[0]][next[1]] + 1;
                        q.add(new int[] { nextx, nexty });
                    }
                }
            }
        }
    }

}
