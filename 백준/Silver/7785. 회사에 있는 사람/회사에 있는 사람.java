import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (map.containsKey(str)) {
                map.remove(str);
            } else {
                map.put(str, st.nextToken());
            }

        }
        String S[] = new String[map.size()];
        int C = 0;
        for (String r : map.keySet()) {
            S[C++] = r;
        }
        Arrays.sort(S);
        for (int i = map.size(); i > 0; i--) {
            System.out.println(S[i - 1]);
        }
    }
}
