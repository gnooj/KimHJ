import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static String map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int N = Integer.parseInt(num);
        Integer arr[] = new Integer[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = N % 10;
            N = N / 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int R : arr) {
            System.out.print(R);
        }
    }
}
