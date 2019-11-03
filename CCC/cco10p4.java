import java.io.*;
import java.util.Arrays;
public class cco10p4 {

	public static class Part implements Comparable <Part> {
		int c, v, t;
		public Part (int cost, int value, int type) {
			c = cost;
			v = value;
			t = type;
		}
		public int compareTo(Part o) {
			if (this.t>o.t) return 1;
			else if (this.t<o.t) return -1;
			else return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int T = readInt(), N = readInt();
		Part parts [] = new Part [N];
		for (int i = 0; i<N; i++) {
			int c = readInt(), v = readInt(), t = readInt();
			parts[i] = new Part(c, v, t);
		}
		Arrays.sort(parts);

		int B = readInt();
		int dp [][] = new int [N+1][B+1];

		int types = 1, curt = 1, last = 0;
		for (int i = 1; i<=N; i++) {
			if (parts[i-1].t==curt) {
				//System.out.println("\nnow considering part "+(i-1)+" (cost: "+parts[i-1].c+" value: "+parts[i-1].v+") with c: "+parts[i-1].c+", v: "+parts[i-1].v+", and t: "+parts[i-1].t);
				for (int j = 1; j<=B; j++) {
					if (j>=parts[i-1].c) {
						// this was the other (now incomplete code of) method of checking where the type split was 
						// finding where it changed, but it's faster to keep it in a "last" variable and update *when* it changes
//						for (int k = 1; k<i; k++) if (parts[k].t!=parts[i-1].t) {
//							flag = true;
//							dp[i][j] = Math.max(dp[k][j-parts[i-1].c]+parts[i-1].v, dp[i-1][j]);
//						} 
						dp[i][j] = Math.max(dp[last][j-parts[i-1].c]+parts[i-1].v, dp[i-1][j]);
						//	System.out.println("new best! same type! taking part "+i+" (cost: "+parts[i-1].c+" value: "+parts[i-1].v+") with max cost at "+j+" is "+dp[i][j]);
					} else dp[i][j] = dp[i-1][j];
				}
			} else {
				last = i-1;
				types++;
				//	System.out.println("\nnew type!");
				//	System.out.println("\nnow considering part "+(i-1)+" with c: "+parts[i-1].c+", v: "+parts[i-1].v+", and t: "+parts[i-1].t);
				for (int j = 1; j<=B; j++) {
					if (j>=parts[i-1].c) {
						dp[i][j] =  Math.max(dp[i-1][j-parts[i-1].c]+parts[i-1].v, dp[i-1][j]);
						//	System.out.println("new best! under split! taking part "+i+" (cost: "+parts[i-1].c+" value: "+parts[i-1].v+") with max cost at "+j+" is "+dp[i][j]);
					} else {
						dp[i][j] = dp[i-1][j];
						//	System.out.println("new best! under split! same as before! taking part "+i+" (cost: "+parts[i-1].c+" value: "+parts[i-1].v+") with max cost at "+j+" is "+dp[i][j]);
					}
				}
			}
			curt = parts[i-1].t;
		}

		if (types!=T) System.out.println("-1");
		else System.out.println(dp[N][B]);

	}

	public static int readInt() throws IOException {
		int c = System.in.read(), ret = 0;
		boolean num = false;
		while (true) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret*10 +c-'0';
			} else if (num) break;
			c = System.in.read();
		}
		return ret;
	}

}
