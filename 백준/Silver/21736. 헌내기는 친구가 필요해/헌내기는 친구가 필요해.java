import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] X = { -1, 0, 1, 0 };
    static int[] Y = { 0, -1, 0, 1 };
    static boolean visit[][];

    static String map[][];
    static int N;
    static int M;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N][M];
        map = new String[N][M];
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = String.valueOf(str.charAt(j));
                if (map[i][j].equals("I")) {
                    startx = i;
                    starty = j;
                }
            }
        }

        bfs(startx, starty);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("TT");
        }

    }

    static void bfs(int startx, int starty) {
        Queue<int[]> q = new LinkedList<>();

        visit[startx][starty] = true;
        q.add(new int[] { startx, starty });

        while (!q.isEmpty()) {
            int node[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node[0] + X[i];
                int ny = node[1] + Y[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !map[nx][ny].equals("X")) {
                    if (!visit[nx][ny]) {
                        visit[nx][ny] = true;
                        q.add(new int[] { nx, ny });
                        if (map[nx][ny].equals("P")) {
                            count++;
                        }
                    }
                }
            }
        }
    }
}