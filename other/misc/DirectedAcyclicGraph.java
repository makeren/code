import java.util.*;
import java.io.*;
public class DirectedAcyclicGraph {
	public static int vis [];
	public static int adj [][];
	public static boolean acyclic = true;
	public static int N = 0;

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		N = sc.nextInt();
		Stack <Integer> S = new Stack<>();

		vis = new int [N];
		adj = new int [N][N];

		for (int i = 0; i<N; i++) {
			for (int j = 0; j<N; j++) {
				adj[i][j] = sc.nextInt();
			}
		}
		int n = 0;


		while (true) {
			if (vis[n]==0) {
				S.push(n);
				while (!S.isEmpty()) {
					int cur = S.peek();
					vis[cur] = 1;
					boolean none = true;

					for (int i = 0; i<N; i++) {
			//			System.out.println("c="+cur+"i="+i);
						if (adj[cur][i]==1 && vis[i]==0) {
							none = false;
			//				System.out.println("T");
							S.push(i);
						} else if (adj[cur][i]==1 && S.contains(i) && vis[i]>0) {
							acyclic = false;
			//				System.out.println("CC");
							break;
						}
					}

					if (none) {
						vis[cur] = 2;
						S.pop();
					}
					if (acyclic==false) {
						break;
					}
				}
				if (acyclic==false) {
					break;
				}
			}
			if (n<N-2) {
				n++;
			} else {
				break;
			}
		}

		if (acyclic==true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
