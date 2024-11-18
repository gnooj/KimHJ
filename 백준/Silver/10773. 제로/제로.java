import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        // int arr[] = new int[T];
        // int idx = 0;
        // for (int i = 0; i < T; i++) {
        // int num = Integer.parseInt(br.readLine());
        // if (num == 0) {
        // arr[--idx] = 0;
        // } else {
        // arr[idx] = num;
        // idx++;
        // }
        // }
        // int result = 0;
        // for (int i = 0; i <= idx; i++) {
        // result += arr[i];
        // }
        // System.out.println(result);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                s.pop();
            } else {
                s.push(num);
            }

        }
        int result = 0;
        while (!s.empty()) {
            result += s.pop();
        }
        System.out.println(result);

    }

}
