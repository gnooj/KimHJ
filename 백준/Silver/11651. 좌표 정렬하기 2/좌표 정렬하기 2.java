import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static String map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int arr[][] = new int[T][2];
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                if (e1[1] == e2[1]) {
                    return e1[0] - e2[0];
                } else {
                    return e1[1] - e2[1];
                }

            }

        });
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
