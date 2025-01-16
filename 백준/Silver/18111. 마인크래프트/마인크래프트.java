import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean visit[];
    static int[][] map;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int map[][] = new int[N][M];
        int max = 0;
        int min = 300;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(st.nextToken());
                map[i][j] = a;
                if (max < a) {
                    max = a;
                }
                if (min > a) {
                    min = a;
                }
            }
        }
        int time = 99999999;
        int result = 0;
        int R = 0;
        for (int i = max; i >= min; i--) {
            int b = 0;
            int tb = B;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] < i) {
                        tb -= i - map[j][k];
                        b += i - map[j][k];
                    } else {
                        tb += (map[j][k] - i);
                        b += (map[j][k] - i) * 2;
                    }
                }
            }

            if (tb >= 0 && b < time) {
                time = b;
                result = b;
                R = i;
            }
        }
        System.out.println(result + " " + R);

    }

}