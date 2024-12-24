import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int r = Math.min(N, M);
        int h = Math.max(N, M);
        R(r, h);
        System.out.println(count);
    }

    static void R(int r, int h) {
        count++;
        if (r - h == 0) {
            return;
        }
        int newr = Math.min(h - r, r);
        int newh = Math.max(h - r, r);

        R(newr, newh);

    }
}
