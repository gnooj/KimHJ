import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static int count = 0;
    static int[] C;
    static int Cc = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        T = (int) Math.pow(2, T);
        int arr[] = new int[T];
        result = new int[T];
        C = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(arr, 0, T - 1);
        System.out.println(Cc);

        for (int i = 0; i < T; i++) {
            // System.out.print(C[i] + " ");
            System.out.println(arr[i]);
        }

    }

    static void merge_sort(int[] arr, int r, int h) {
        if (r >= h) {
            return;
        }
        int mid = (r + h) / 2;

        merge_sort(arr, r, mid);
        merge_sort(arr, mid + 1, h);
        merge(arr, r, mid, h);

    }

    static void merge(int[] arr, int r, int mid, int h) {

        // Cc++;
        int idx = 0;
        int i = r;
        int j = mid + 1;
        // Cc += (j - i) * 2;
        if (arr[i] > arr[j]) {

            while (j <= h) {
                result[idx++] = arr[j++];

                Cc += j - idx;
            }
            while (i <= mid) {
                result[idx++] = arr[i++];

                Cc += -(i - idx);

            }
            idx = 0;
            i = r;
            while (i <= h) {
                arr[i++] = result[idx++];
                // Cc++;

            }
        } else {
            return;
        }

    }
}
