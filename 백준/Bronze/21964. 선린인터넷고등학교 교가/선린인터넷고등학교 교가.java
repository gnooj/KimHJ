import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static int count = 0;
    static int[] C;
    static int Cc = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(str.substring(T - 5, T));
    }
}
