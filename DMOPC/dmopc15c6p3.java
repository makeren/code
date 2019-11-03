import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc15c6p3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		// why does commenting that out help?
		
		String nmkin = br.readLine();
		
		String [] nmk = nmkin.split(" ");
		int n = Integer.parseInt(nmk[0]);
		int m = Integer.parseInt(nmk[1]);
		long k = Long.parseLong(nmk[2]);
		int ans = n+1;
		
		int [] field = new int [n+2];
		
		for (int i = 0; i<m; i++) {
			String abin = br.readLine();
			String [] ab = abin.split(" ");
			
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);

			field[a]--; field[b+1]++;
		}
		
		for (int i = 1; i<=n; i++) 
			field[i] += field[i-1];
		
		long [] sum = new long [n+2];
		for (int i = 1; i<=n; i++) {
			field[i] += m; 
			sum[i] = sum[i-1] + field[i];
		}
		for (int l = 0, r = 1; r<=n; r++) {
			while (l <= r && sum[r] - sum[l]>=k) {
				ans = Math.min(ans,  r-l);
				l++;
			}
		}
		if (ans>n) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

		

	}

}
