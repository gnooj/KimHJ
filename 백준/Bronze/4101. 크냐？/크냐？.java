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
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0)
                return;
            if (A > B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
