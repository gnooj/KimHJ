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
        int T = Integer.parseInt(br.readLine());

        System.out.println(fib(T));
    }

    public static int fib(int T) {
        if (T < 1) {
            return 0;
        } else if (T < 2) {
            return 1;
        } else {
            return fib(T - 1) + fib(T - 2);
        }

    }
}