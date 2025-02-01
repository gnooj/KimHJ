import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // int T = Integer.parseInt(br.readLine());

        int max = 0;
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int result = 0;
            for (int j = 0; j < 4; j++) {
                result += Integer.parseInt(st.nextToken());
            }
            if (result > max) {
                max = result;
                idx = i;

            }
        }
        System.out.println(idx+1 + " " + max);
    }
}
