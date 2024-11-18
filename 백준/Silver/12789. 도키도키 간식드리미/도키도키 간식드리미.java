import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> s = new Stack<>();
        int se = 1;
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == se) {
                se++;
            } else {
                s.push(num);
            }

            while (!s.isEmpty() && s.peek() == se) {
                s.pop();
                se++;
            }

        }

        if (s.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

}
