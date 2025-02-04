import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 0;
        int result = 0;
        // int T = Integer.parseInt(br.readLine());
        // st = new StringTokenizer(br.readLine(), " ");
        String A = "I";
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            A = A + "OI";
        }
        int aLen = A.length();
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < m - aLen + 1; i++) {
            for (int j = 0; j < aLen; j++) {
                if (str.charAt(i + j) == A.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == aLen) {
                result++;
            }
            count = 0;

        }
        System.out.println(result);
    }
}
