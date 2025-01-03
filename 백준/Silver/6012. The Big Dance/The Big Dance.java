import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    // static int[] result

    // static boolean T = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        // st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = i + 1;
        }

        mergeS(arr, 0, T - 1);
        System.out.println(count);

    }

    static void mergeS(int arr[], int r, int h) {
        if (r == h - 1) {
            count += arr[r] * arr[r + 1];
            return;
        } else if (r >= h) {
            return;
        }

        int mid = (r + h) / 2;
        // if (h - r % 2 == 0)
        // mid += 1;
        mergeS(arr, r, mid);
        mergeS(arr, mid + 1, h);

    }

}