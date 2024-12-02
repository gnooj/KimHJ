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
        // st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            for (int j = i; j < T - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < T - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (T * 2) - (i * 2) - 3; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}