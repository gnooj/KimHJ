import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] temp = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int arr[][] = new int[T][T];

        if (T == 1) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            System.out.println(A);
            return;
        }
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < T; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = DC(arr, 0, 0, T);
        System.out.println(result);

    }

    static int DC(int[][] arr, int x, int y, int T) {
        int idx = 0;
        if (T == 2) {
            for (int i = x; i < T + x; i++) {
                for (int j = y; j < T + y; j++) {
                    temp[idx++] = arr[i][j];
                }
            }
            Arrays.sort(temp);
            return temp[1];
        } else {
            int arr1[] = new int[4];
            arr1[0] = DC(arr, x, y, T / 2);
            arr1[1] = DC(arr, x, y + (T / 2), T / 2);
            arr1[2] = DC(arr, x + (T / 2), y, T / 2);
            arr1[3] = DC(arr, x + (T / 2), y + (T / 2), T / 2);
            Arrays.sort(arr1);
            return arr1[1];
        }

    }
}
