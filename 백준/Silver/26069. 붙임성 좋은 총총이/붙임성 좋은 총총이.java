import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());

        Set<String> s = new HashSet<>();
        s.add("ChongChong");

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String A = st.nextToken();
            String B = st.nextToken();

            if (s.contains(A) || s.contains(B)) {
                s.add(A);
                s.add(B);
            }
        }
        System.out.println(s.size());

    }
}