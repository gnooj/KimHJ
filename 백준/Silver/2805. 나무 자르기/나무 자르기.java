import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int treeLen;
    static int tree;
    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        // int T = Integer.parseInt(br.readLine());
        tree = Integer.parseInt(st.nextToken());
        treeLen = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[tree];
        int max = -1;
        int min = 0;
        for (int i = 0; i < tree; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        while (min < max) {
            int mid = (min + max) / 2;
            result = 0;
            for (int A : arr) {
                if (A > mid) {
                    result += A - mid;
                }
            }
            // System.out.println("reuslt = " + result);

            if (result < treeLen) {

                max = mid;
            } else {
                min = mid + 1;
            }

        }
        System.out.println(min - 1);

    }

}