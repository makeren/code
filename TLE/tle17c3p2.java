import java.io.*;
public class tle17c3p2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String [] SK = br.readLine().split(" ");

		int S = Integer.parseInt(SK[0]);
		int K = Integer.parseInt(SK[1]);
		long [] sec = new long [S];
		long [] vis = new long [K+1];

		for (int i = 0; i<S; i++) {
			sec[i] = Long.parseLong(br.readLine());
		}

		for (int i = 0; i<K; i++) {
			vis[i] = Long.parseLong(br.readLine());
		}

		long count = 1;
		int n = 2;
		long csn = 0;
		long at = vis[0];
		long to = vis[1];

		while (n<=K) {
			
			for (int i = 0; i<S; i++) {
				if (at==sec[i]) {
					csn = i;
					break;
				}
			}

			for (int i = 0; i<S; i++) {
				if (to==sec[i]) {
					count+=Math.abs(csn-i);
					at = to;
					to = vis[n];
					break;
				}
			}
			n++;
		}

		System.out.println(count);

	}

}
