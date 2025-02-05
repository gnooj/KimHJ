import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            boolean flag = true;
            for (int j = x; j < n * m; j += n) {
                if (j % m == y) {
                    System.out.println(j + 1);
                    flag = false;
                }
                if (!flag) {
                    break;
                }
            }
            if(flag){
                System.out.println(-1);
            }

        }
    }
    // 3
    // 10 12 3 9=33
    // 10 12 7 2
    // 13 11 5 6=83
}
