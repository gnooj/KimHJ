import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String arr[][] = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == null) {
                    continue;
                }
                System.out.print(arr[i][j]);
            }
        }

    }
}