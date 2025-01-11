import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int arr[] = new int[81];
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++) {
                for (int k = 1; k <= C; k++) {
                    arr[i + j + k] = arr[i + j + k] + 1;
                }
            }
        }
        int max = -1;
        int result = 0;
        for (int i = 0; i <= 80; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = i;
            }
        }
        System.out.println(result);

    }

}