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
        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                dq.addLast(num);
            }
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            int m = Integer.parseInt(st.nextToken());
            dq.addFirst(m);
            sb.append(dq.pollLast()).append(" ");
        }
        System.out.println(sb);

    }

}