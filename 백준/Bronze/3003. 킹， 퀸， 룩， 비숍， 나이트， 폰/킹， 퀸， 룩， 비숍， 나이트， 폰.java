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
        int result[] = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < 6; i++) {
            result[i] -= Integer.parseInt(st.nextToken());
            System.out.print(result[i] + " ");
        }
    }
}