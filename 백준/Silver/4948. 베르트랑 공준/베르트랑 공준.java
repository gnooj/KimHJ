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
            int count = 0;
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                System.out.println(1);
                continue;
            }
            if (num == 0) {
                break;
            }

            boolean P[] = new boolean[2 * num + 1];
            P[1] = true;
            for (int i = 2; i <= 2 * num; i++) {
                if (!P[i]) {
                    if (i > num) {
                        count++;
                    }
                }
                for (int j = i * 2; j <= 2 * num; j += i) {
                    P[j] = true;
                }

            }
            System.out.println(count);

        }
    }

}
