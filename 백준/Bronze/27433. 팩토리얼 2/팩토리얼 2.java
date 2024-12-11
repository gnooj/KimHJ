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
        if (T == 0) {
            System.out.println(1);
            return;
        }

        System.out.println(factorial(T));
    }

    public static long factorial(int T) {
        if (T < 2) {
            return T;
        } else {
            return factorial(T - 1) * T;
        }
    }
}