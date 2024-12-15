import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");0 4 2 5 6
        // int T = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(str[i]);
            result += a * a;
        }

        System.out.println(result % 10);

    }

}