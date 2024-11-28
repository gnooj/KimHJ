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
        // st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int t = A * (B % 10);
        B = B / 10;
        int f = A * (B % 10);
        B = B / 10;
        int ff = A * (B % 10);
        sb.append(t).append("\n");
        sb.append(f).append("\n");
        sb.append(ff).append("\n");
        sb.append(t + (f * 10) + (ff * 100));
        System.out.println(sb);

    }
}