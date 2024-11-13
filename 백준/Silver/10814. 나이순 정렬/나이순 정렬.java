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
        String[][] arr = new String[T][2];

        for (int i = 0; i < T; i++) {
            String str[] = br.readLine().split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }
        String temp = "";

        Arrays.sort(arr, new Comparator<String[]>() {

            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }

        });

        // for (int i = 0; i < T; i++) {
        // for (int j = i; j < T; j++) {
        // if (Integer.parseInt(arr[i][0]) > Integer.parseInt(arr[j][0])) {
        // temp = arr[i][0];
        // arr[i][0] = arr[j][0];
        // arr[j][0] = temp;

        // temp = arr[i][1];
        // arr[i][1] = arr[j][1];
        // arr[j][1] = temp;
        // }
        // }
        // }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
