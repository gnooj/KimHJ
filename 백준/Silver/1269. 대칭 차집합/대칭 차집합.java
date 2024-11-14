import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        int aT = Integer.parseInt(st.nextToken());
        int bT = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aT; i++) {
            mapA.put(Integer.parseInt(st.nextToken()), 0);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bT; i++) {
            mapB.put(Integer.parseInt(st.nextToken()), 0);
        }
        int result = 0;
        for (int r : mapA.keySet()) {
            if (!mapB.containsKey(r)) {
                result++;
            }
        }
        for (int r : mapB.keySet()) {
            if (!mapA.containsKey(r)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
