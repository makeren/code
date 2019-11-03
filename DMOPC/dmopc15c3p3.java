import java.util.*;
public class dmopc15c3p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		boolean [][] adj = new boolean [N][N];
		for (int i = 0; i<M; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			adj[u][v] = true;
			adj[v][u] = true;
		}

	}

}
