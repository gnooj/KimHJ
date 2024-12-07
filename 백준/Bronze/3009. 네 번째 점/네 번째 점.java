import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int xtemp = 0;
        int ytemp = 0;
        if (x == x1) {
            xtemp = x2;
        } else if (x == x2) {
            xtemp = x1;
        } else {
            xtemp = x;
        }
        if (y == y1) {
            ytemp = y2;
        } else if (y == y2) {
            ytemp = y1;
        } else {
            ytemp = y;
        }
        System.out.println(xtemp + " " + ytemp);
    }
}