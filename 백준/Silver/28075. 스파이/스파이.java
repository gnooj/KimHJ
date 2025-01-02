import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    // static boolean T = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        int misSc[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                misSc[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 3; j++) {
        // R(misSc, N - 1, misSc[i][j], i, j);
        // }
        // }
        R(misSc, N, M, 0, -1);

        System.out.println(count);

    }

    static void R(int[][] misSc, int N, int M, int x, int y) {
        if (N == 0) {
            if (M <= 0) {
                // System.out.println("x = " + x + " y = " + y);
                count++;
                // return;
            }
            return;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (y == j) {
                    R(misSc, N - 1, M - (misSc[i][j] / 2), i, j);
                } else {
                    R(misSc, N - 1, M - misSc[i][j], i, j);
                }

            }
        }

    }
}
