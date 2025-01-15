import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                sb.append(Q.isEmpty() ? "0" : Q.poll());
                sb.append("\n");
            } else {
                Q.add(num);
            }
        }
        System.out.println(sb);
    }

}