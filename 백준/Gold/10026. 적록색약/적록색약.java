import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int dx[] = { 1, 0, 0, -1 };
    static int dy[] = { 0, -1, 1, 0 };
    static boolean visit[][];
    static int T;
    static char map[][];
    static int count1 = 0;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        visit = new boolean[T][T];
        map = new char[T][T];

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < T; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    count++;
                }
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }

            }
        }
        visit = new boolean[T][T];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    count1++;
                }
            }
        }

        System.out.println(count + " " + count1);

    }

    static void bfs(int x, int y) {
        if (visit[x][y]) {
            return;
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });
        visit[x][y] = true;
        char target = map[x][y];
        while (!q.isEmpty()) {
            int node[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = dx[i] + node[0];
                int newY = dy[i] + node[1];
                if (newX > -1 && newY > -1 && newX < T && newY < T && !visit[newX][newY] && map[newX][newY] == target) {
                    q.add(new int[] { newX, newY });
                    visit[newX][newY] = true;
                }

            }
        }

    }
}
