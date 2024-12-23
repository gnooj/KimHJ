import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] temp;
    static int count = 0;
    static int[] result;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int arr[] = new int[A];
        temp = new int[A];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, A - 1);

        if (count < K) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < A; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    static void merge_sort(int[] arr, int r, int h) {
        if (r >= h) {
            return;
        }

        int mid = (r + h) / 2;
        merge_sort(arr, r, mid);
        if (count >= K) {
            return;
        }
        merge_sort(arr, mid + 1, h);
        if (count >= K) {
            return;
        }
        merge(arr, r, mid, h);
        if (count >= K) {
            return;
        }

    }

    static void merge(int[] arr, int r, int mid, int h) {
        int idx = 0;
        int i = r;
        int j = mid + 1;
        while (i <= mid & j <= h) {
            if (arr[i] >= arr[j]) {
                temp[idx++] = arr[j++];

            } else {
                temp[idx++] = arr[i++];

            }

        }
        while (j <= h) {
            temp[idx++] = arr[j++];
        }
        while (i <= mid) {
            temp[idx++] = arr[i++];

        }
        i = r;
        idx = 0;
        while (i <= h) {
            arr[i++] = temp[idx++];
            count++;
            if (count == K) {

                return;
            }
        }

    }
}
