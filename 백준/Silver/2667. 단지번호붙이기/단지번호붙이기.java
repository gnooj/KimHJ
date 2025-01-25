import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] visit = new int[26][26];
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int n;
    static int m;
    static char[][] map;
    static int T;
    static int[] result;
    static int rc = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        // st = new StringTokenizer(br.readLine(), " ");
        map = new char[T][T];
        result = new int[999];
        for (int i = 0; i < 999; i++) {
            result[i] = 9999;
        }
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < T; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {

                bfs(i, j);
            }
        }
        System.out.println(rc);
        Arrays.sort(result);
        for (int i = 0; i < rc; i++) {
            System.out.println(result[i]);
        }

    }

    static void bfs(int x, int y) {
        if (map[x][y] == '0' || visit[x][y] != 0) {
            return;
        }
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] { x, y });
        int count = 0;
        count++;
        visit[x][y] = 1;
        while (!q.isEmpty()) {
            int temp[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = temp[0] + dx[i];
                int nexty = temp[1] + dy[i];
                if (nextx > -1 && nexty > -1 && nextx < T && nexty < T &&
                        map[nextx][nexty] != '0' && visit[nextx][nexty] == 0) {
                    visit[nextx][nexty] = 1;
                    count++;
                    q.add(new int[] { nextx, nexty });
                }

            }
        }
        result[rc] = count;
        rc++;
    }
}
