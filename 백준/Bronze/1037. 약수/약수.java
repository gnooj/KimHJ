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

        st = new StringTokenizer(br.readLine(), " ");
        int h = 0;
        int r = 9999999;
        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (h < temp) {
                h = temp;
            }
            if (r > temp) {
                r = temp;
            }
        }
        System.out.println(h * r);
    }
}