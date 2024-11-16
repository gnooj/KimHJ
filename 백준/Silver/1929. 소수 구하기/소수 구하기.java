import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startP = Integer.parseInt(st.nextToken());
        int endP = Integer.parseInt(st.nextToken());

        for (int i = startP; i <= endP; i++) {
            if (i < 2)
                continue;
            if (i == 2) {
                System.out.println(i);
                continue;
            }
            if (i % 2 == 0)
                continue;

            boolean flag = true;
            for (int j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }

}
