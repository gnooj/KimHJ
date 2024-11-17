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
        int stack[] = new int[T + 1];
        int idx = 0;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int cn = Integer.parseInt(st.nextToken());

            if (cn == 1) {
                cn = Integer.parseInt(st.nextToken());
                stack[idx + 1] = cn;
                idx++;
                cn = 1;
                continue;
            }
            if (cn == 2) {
                if (idx == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[idx]);
                    stack[idx] = 0;
                    idx--;
                }
            }
            if (cn == 3) {
                System.out.println(idx);
            }
            if (cn == 4) {
                if (idx == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if (cn == 5) {
                if (idx == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[idx]);
                }
            }
        }

    }

}
