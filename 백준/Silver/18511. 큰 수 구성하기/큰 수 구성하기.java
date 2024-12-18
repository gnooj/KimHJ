import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int result, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int arr[] = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        R(arr, 0, N);
        System.out.println(result);
    }

    static void R(int[] arr, int start, int N) {
        if (N < start) {
            return;
        }
        result = Math.max(result, start);
        for (int i = 0; i < K; i++) {
            R(arr, start * 10 + arr[i], N);
        }
    }
}
