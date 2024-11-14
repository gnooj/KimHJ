import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        String str = br.readLine();
        // int sLen = 0;
        // for (int i = 2; i <= str.length(); i++) {
        //     sLen += i;
        // }
        // sLen++;

        for (int i = 1; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                set.add(str.substring(j - i, j));
            }
        }
        int count = 0;
        for (String result : set) {
            count++;
        }

        System.out.println(count);
    }
}
