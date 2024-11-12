import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 666;
        while (true) {

            if (String.valueOf(start).contains("666")) {
                count++;
            }
            if (count == n) {
                break;
            }
            start++;
        }
        System.out.println(start);
    }
}
