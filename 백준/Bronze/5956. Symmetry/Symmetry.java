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
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        R(x, y);
        int result = 1;
        if (count == 0)
            result = 0;

        for (int i = 1; i < count; i++) {
            result = result * 4 + 1;
        }
        System.out.println(result);

    }

    static void R(long x, long y) {
        if (x % 2 == 0 || y % 2 == 0) {
            return;
        } else {
            count++;
            R(x / 2, y / 2);

        }

    }
}
