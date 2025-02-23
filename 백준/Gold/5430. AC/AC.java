import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str1 = br.readLine();
            char[] arr = str1.toCharArray();
            int t = Integer.parseInt(br.readLine());
            int sIdx = 0;
            int eIdx = t;

            boolean flag = false;// false = move to sidx, true = move to eidx
            String str2[] = br.readLine().split("\\[|\\]|,");
            int sLen = str1.length();
            for (int j = 0; j < sLen; j++) {
                if (arr[j] == 'R') {
                    flag = !flag;
                }
                if (arr[j] == 'D') {
                    // System.out.println("in!!");
                    if (flag) {
                        eIdx--;

                        // System.out.println("eIdx = " + eIdx);
                    } else {
                        sIdx++;

                    }
                }
            }
            if (eIdx - sIdx < 0) {
                sb.append("error");
                sb.append("\n");
                continue;
            }
            if (flag) {
                sb.append("[");
                for (int j = eIdx - 1; j >= sIdx; j--) {
                    sb.append(str2[j + 1]);
                    if (j != sIdx) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                sb.append("\n");
            } else {
                sb.append("[");
                for (int j = sIdx; j <= eIdx - 1; j++) {
                    sb.append(str2[j + 1]);
                    if (j != eIdx - 1) {
                        sb.append(",");
                    }

                }
                sb.append("]");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
