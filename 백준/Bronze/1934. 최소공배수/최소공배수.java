import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int gcf;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int r = 0;
            int h = 0;
            if (a > b) {
                r = b;
                h = a;
            } else {
                r = a;
                h = b;
            }
            gdc(h, r);
            System.out.println((a * b) / gcf);

        }

    }

    public static void gdc(int a, int b) {

        if (a % b != 0) {
            gdc(b, a % b);
        } else {
            gcf = b;
            return;
        }

    }
}
