import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int start = 0;
    static int temp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int len = str.length();

            int result = P(str, len - 1, start);
            System.out.println(result + " " + (count + 1));

            count = 0;
            start = 0;

        }
    }

    static int P(String str, int len, int start) {
        if (start >= len - start) {
            return 1;
        } else if (str.charAt(start) != str.charAt(len - start)) {
            return 0;
        }
        count += 1;
        start++;
        return P(str, len, start);
    }
}