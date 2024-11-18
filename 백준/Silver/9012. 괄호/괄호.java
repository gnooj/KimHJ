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
        Stack<String> s = new Stack<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String ch = st.nextToken();
            for (int j = 0; j < ch.length(); j++) {
                if (ch.charAt(j) == ')') {
                    if (s.isEmpty() || s.peek() == ")") {
                        s.push(")");
                    } else {
                        s.pop();
                    }
                } else {
                    s.push("(");
                }
            }
            if (s.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                s.clear();
            }
        }
    }

}
