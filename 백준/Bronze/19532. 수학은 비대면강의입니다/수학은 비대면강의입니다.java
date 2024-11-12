import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int d = Integer.parseInt(str[3]);
        int e = Integer.parseInt(str[4]);
        int f = Integer.parseInt(str[5]);
        int r = 0;
        int rr = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {

                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    r = i;
                    rr = j;
                }
            }

        }
        System.out.println(r + " " + rr);

    }
}