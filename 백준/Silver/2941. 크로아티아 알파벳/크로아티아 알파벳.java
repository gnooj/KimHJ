import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str[] = br.readLine().split("");
        String C[] = { "=", "-", "j" };
        // st = new StringTokenizer(br.readLine(), " ");
        int len = str.length;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < len; i++) {
            if (str[i].equals("=")) {
                if (i > 1 && str[i - 1].equals("z") && str[i - 2].equals("d")) {
                    count2++;
                } else {
                    count++;
                }
            }
            if (str[i].equals("-")) {
                count++;
            }
            if (str[i].equals("j")) {
                if (i > 0) {
                    if (str[i - 1].equals("l") || str[i - 1].equals("n")) {
                        count++;
                    }
                }
            }

        }
        // System.out.println(len);
        // System.out.println(count);
        // System.out.println(count2);
        len = len - ((count * 2) + (count2 * 3)) + count + count2;
        // System.out.println(count);
        System.out.println(len);
    }
}