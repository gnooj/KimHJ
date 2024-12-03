import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        float sum = 0f;
        float sum2 = 0f;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            float score = Float.parseFloat(st.nextToken());
            // System.out.println(score);
            String grade = st.nextToken();
            switch (grade) {
                case "A+":
                    sum += score * 4.5;
                    sum2 += score;
                    break;
                case "A0":
                    sum += score * 4.0;
                    sum2 += score;
                    break;
                case "B+":
                    sum += score * 3.5;
                    sum2 += score;
                    break;
                case "B0":
                    sum += score * 3.0;
                    sum2 += score;
                    break;
                case "C+":
                    sum += score * 2.5;
                    sum2 += score;
                    break;
                case "C0":
                    sum += score * 2.0;
                    sum2 += score;
                    break;
                case "D+":
                    sum += score * 1.5;
                    sum2 += score;
                    break;
                case "D0":
                    sum += score * 1.0;
                    sum2 += score;
                    break;
                case "F":
                    sum2 += score;
                    break;
                case "P":
                    break;
            }

        }

        System.out.printf("%.6f", sum / sum2);

    }
}