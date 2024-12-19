import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] sum;
    static int T;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        T = Integer.parseInt(br.readLine());
        int map[][] = new int[T][T];
        sum = new int[T][T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < T; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = R(map, 0, 0);
        System.out.println(count + " " + T * T);

    }

    static int R(int[][] map, int startX, int startY) {

        if (startX == T || startY == T) {
            count++;
            return 0;
        } else {

            return map[startX][startY] + Math.max(R(map, startX + 1, startY),
                    R(map, startX, startY + 1));
        }

    }
}
