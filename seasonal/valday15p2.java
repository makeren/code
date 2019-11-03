import java.io.*;
public class valday15p2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int C = readInt(), M = readInt();
		int [][] dp = new int [C+1][M+1];
		int [] princesses = new int [C];
		int [] time = new int [C];
		for (int i = 0; i<C; i++) {
			princesses[i] = readInt();
			time[i] = readInt();
		}
		for (int i = 0; i<=C; i++) {
			for (int j = 0; j<=M; j++) {
				if (i==0 || j==0) dp[i][j] = 0;
				else {
					if (j>=time[i-1]) {
						dp[i][j] = Math.max(dp[i-1][j-time[i-1]]+princesses[i-1], dp[i-1][j]);
					} else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		
		System.out.println(dp[C][M]);
		

	}
	
	public static int readInt() throws IOException {
		int c = System.in.read(), ret = 0;
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
