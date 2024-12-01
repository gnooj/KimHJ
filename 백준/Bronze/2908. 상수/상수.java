import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int t1 = A % 10 * 100;
        int t2 = B % 10 * 100;
        A = A / 10;
        B = B / 10;
        t1 += A % 10 * 10;
        t2 += B % 10 * 10;
        A = A / 10;
        B = B / 10;
        t1 += A % 10;
        t2 += B % 10;
        if (t1 > t2) {
            System.out.println(t1);
        } else {
            System.out.println(t2);
        }

    }
}