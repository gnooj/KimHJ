import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        char[][] map = new char[4 * (T - 1) + 1][4 * (T - 1) + 1];

        for (int i = 0; i < 4 * (T - 1) + 1; i++) {
            for (int j = 0; j < 4 * (T - 1) + 1; j++) {
                map[i][j] = ' ';
            }

        }
        R(0, T, map);
        for (int i = 0; i < 4 * (T - 1) + 1; i++) {
            for (int j = 0; j < 4 * (T - 1) + 1; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();

        }

    }

    static void R(int start, int T, char[][] map) {
        if (T < 1) {
            return;
        }
        for (int i = start; i < 4 * (T - 1) + 1 + start; i++) {
            map[start][i] = '*';
            map[4 * (T - 1) + start][i] = '*';
            map[i][4 * (T - 1) + start] = '*';
            map[i][start] = '*';
        }
        R(start + 2, T - 1, map);

    }
}
