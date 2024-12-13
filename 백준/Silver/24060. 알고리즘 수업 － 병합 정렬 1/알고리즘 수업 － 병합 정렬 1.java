import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result[];
    static int k;
    static int count = 0;
    static int R = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        int ALen = Integer.parseInt(st.nextToken());
        result = new int[ALen];
        k = Integer.parseInt(st.nextToken());
        int A[] = new int[ALen];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ALen; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(A, 0, ALen - 1);
        if (R > 0) {
            System.out.println(R);
        } else {
            System.out.println(-1);
        }

    }

    static void merge_sort(int[] A, int l, int h) {
        if (l < h) {
            int mid = (h + l) / 2;
            merge_sort(A, l, mid);
            merge_sort(A, mid + 1, h);
            merge(A, l, mid, h);
        }
    }

    static void merge(int[] A, int l, int mid, int h) {

        int rei = 0;
        int li = l;
        int ri = mid + 1;

        while (li <= mid && ri <= h) {
            if (A[li] > A[ri]) {
                result[rei++] = A[ri++];

            } else {
                result[rei++] = A[li++];

            }
        }
        while (li <= mid) {
            result[rei++] = A[li++];

        }
        while (ri <= h) {
            result[rei++] = A[ri++];

        }
        int t = 0;
        for (int i = l; i <= h; i++) {
            A[i] = result[t++];
            count++;
            if (k == count) {
                R = A[i];
            }
        }

    }

}