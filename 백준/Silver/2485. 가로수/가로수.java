import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcf = 0;
        for (int i = 0; i < T - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            gcf = gcd(gap, gcf);
        }

        System.out.println((arr[T - 1] - arr[0]) / gcf + 1 - T);

    }

    static int gcd(int h, int r) {
        if (r == 0) {
            return h;
        }
        return gcd(r, h % r);
    }

}
