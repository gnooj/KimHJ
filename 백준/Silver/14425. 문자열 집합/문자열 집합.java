import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static String map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String K = br.readLine();
            map.put(K, 0);
        }
        for (int i = 0; i < M; i++) {
            String C = br.readLine();
            if (map.containsKey(C)) {
                map.put(C, map.get(C) + 1);
            }
        }
        int result = 0;
        for (String R : map.keySet()) {
            result += map.get(R);
        }
        System.out.println(result);
    }
}
