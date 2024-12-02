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
        int count = 0;
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char[] C = str.toCharArray();
            int len = str.length();
            boolean B = false;
            for (int j = 0; j < len; j++) {
                char ch = C[j];
                for (int k = j + 1; k < len; k++) {
                    if (ch != C[k]) {
                        for (int q = k; q < len; q++) {
                            if (ch == C[q]) {
                                B = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!B) {
                count++;
            }

        }
        System.out.println(count);
    }
}