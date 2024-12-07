import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if (A == 0) {
                break;
            }
            int min = Math.min(Math.min(A, B), C);
            int max = Math.max(Math.max(A, B), C);
            int mid = (A + B + C) - (min + max);
            if (max >= min + mid) {
                System.out.println("Invalid");
            } else {
                if (A == C && C == B) {
                    System.out.println("Equilateral");
                } else if (A == B || A == C || B == C) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        }
    }
}