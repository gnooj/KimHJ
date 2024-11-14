import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long gcf;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long r = 0;
        long h = 0;
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

    public static void gdc(long a, long b) {

        if (a % b != 0) {
            gdc(b, a % b);
        } else {
            gcf = b;
            return;
        }

    }
}
