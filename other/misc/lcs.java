import java.io.*;
import java.util.*;

public class lcs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		int [] A = new int [N];
		int [] B = new int [M];
		int [][] dp = new int [N+1][M+1];

		for (int i = 0; i<N; i++) A[i] = readInt();
		for (int i = 0; i<M; i++) B[i] = readInt();

		for (int i = 0; i<=N; i++) dp[i][0] = 0;
		for (int i = 0; i<=M; i++) dp[0][i] = 0;
		
		for (int x = 0; x<=N; x++) {
			for (int y = 0; y<=M; y++) {
				if (x==0 || y==0) {
					dp[x][y] = 0;
				} else if (A[x-1]==B[y-1]) {
					dp[x][y] = dp[x-1][y-1]+1;
				} else {
					dp[x][y] = Math.max(dp[x-1][y], dp[x][y-1]);
				}
			}
		}
		
		System.out.println(dp[N][M]);

	}

	public static int readInt() throws IOException {
		int ret = 0, c = System.in.read();
		boolean num = false;
		while (true) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret*10+c-'0';
			} else if (num) break;
			c = System.in.read();
		}
		return ret;
	}

}
