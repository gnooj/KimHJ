import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();

        String name = br.readLine();
        int count = 0;

        for (int i = 0; i < T - 1; i++) {
            name = br.readLine();
            if (!name.equals("ENTER")) {
                s.add(name);
            }

            // System.out.println("2222 == " + s.size());

            if (name.equals("ENTER") || i == T - 2) {
                count += s.size();
                // System.out.println("count size = " + count);
                s = new HashSet<>();
            }

        }
        System.out.println(count);

    }
}