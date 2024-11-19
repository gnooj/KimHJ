import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        Deque<int[]> d = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            d.addLast(new int[] { i + 1, Integer.parseInt(st.nextToken()) });
        }

        while (!d.isEmpty()) {
            int num[] = d.pollFirst();
            System.out.println(num[0]);

            int m = num[0];
            if (d.isEmpty())
                break;
            if (num[1] > 0) {
                for (int i = 0; i < num[1] - 1; i++) {
                    d.addLast(d.poll());
                }
            } else {
                for (int i = 0; i < Math.abs(num[1]); i++) {
                    d.addFirst(d.pollLast());
                }
            }
        }
        // 3,-3,-1,1,2
    }

}