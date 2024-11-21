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
        int result = 1;
        for (int i = 1; i <= T; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    // static int factorial(int T) {
    // if (T == 1) {
    // return 1;
    // } else {
    // return T * factorial(T - 1);
    // }

    // }
}