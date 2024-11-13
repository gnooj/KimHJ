import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int T = Integer.parseInt(str[0]);
        int cutLine = Integer.parseInt(str[1]);
        int arr[] = new int[T];
        str = br.readLine().split(" ");

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int temp = 0;
        for (int i = 0; i < T; i++) {
            for (int j = i; j < T; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[T - cutLine]);

    }
}
