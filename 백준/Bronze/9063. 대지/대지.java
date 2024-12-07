import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int xm = Integer.MAX_VALUE;
        int ym = Integer.MAX_VALUE;
        int xt = Integer.MIN_VALUE;
        int yt = Integer.MIN_VALUE;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (xt < A) {
                xt = A;
            }
            if (yt < B) {
                yt = B;
            }
            if (xm > A) {
                xm = A;
            }
            if (ym > B) {
                ym = B;
            }

        }

        System.out.println((xt - xm) * (yt - ym));

    }
}