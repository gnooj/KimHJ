import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int o = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            if (o == 0) {
                return;
            }
            if (t % o == 0) {
                System.out.println("factor");
                continue;
            } else if (o % t == 0) {
                System.out.println("multiple");
                continue;
            } else {
                System.out.println("neither");
            }
        }
    }
}