import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean visit[];
    static int[][] map;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = new int[T];
        int tarr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            tarr[i] = arr[i];
        }
        Arrays.sort(tarr);
        int idx = 0;
        for (int i = 0; i < T; i++) {
            if (!map.containsKey(tarr[i])) {
                map.put(tarr[i], idx++);
            }
        }
        for (int i = 0; i < T; i++) {
            arr[i] = map.get(arr[i]);

        }
        for (int a : arr) {
            sb.append(a + " ");
        }
        System.out.println(sb);
    }

}