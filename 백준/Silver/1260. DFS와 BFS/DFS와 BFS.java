import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[][] map;
	static boolean[] visit;
	static int[] NU;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		map = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		NU = new int[N];
		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int C = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			map[C][B] = map[B][C] = 1;
		}
		dfs(V);
		for (int i = 0; i <= N; i++) {
			visit[i] = false;
		}
		System.out.println();
		bfs(V);
	}

	static void dfs(int start) {
		visit[start] = true;
		System.out.print(start + " ");
		for (int i = 1; i < map.length; i++) {
			if (!visit[i] && map[start][i] == 1) {
				visit[i] = true;
				dfs(i);
			}
		}
		return;
	}

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true;
		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");
			for (int i = 1; i < map.length; i++) {
				if (!visit[i] && map[node][i] == 1) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
	}
}