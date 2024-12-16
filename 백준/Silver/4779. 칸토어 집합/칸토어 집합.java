import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");0 4 2 5 6
        String str;
        while ((str = br.readLine()) != null) {
            int T = Integer.parseInt(str);
            T = (int) Math.pow(3, T);
            sb = new StringBuilder();
            for (int i = 0; i < T; i++) {
                sb.append("-");
            }

            R(0, T);
            System.out.println(sb);
        }

    }

    static void R(int start, int T) {
        if (T < 1) {
            return;
        }
        int size = T / 3;
        for (int i = start + size; i < start + 2 * size; i++) {
            sb.setCharAt(i, ' ');
        }

        R(start, size);
        R(start + 2 * size, size);

    }
}