import java.io.*;

public class Postcard {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		String [] MN = br.readLine().split(" ");
		int N = Integer.parseInt(MN[0]);
		int M = Integer.parseInt(MN[1]);

		int L = N;
		int R = 0;
		int T = M;
		int B = 0;

		String [] p = new String [N];

		for (int i = 0; i<N; i++) {
			p[i] = br.readLine();
		}

		for (int i = 0; i<N; i++) {

			if (p[i].contains("*")) {
				if (i<T) {
					T = i;
				}
			}

			for (int j = 0; j<M*2-1; j++) {
				if (p[i].charAt(j)=='*') {
					if (j<L) {
						L = j;
					}
				}
			}
			
			for (int j = M*2-2; j>=0; j--) {
				if (p[i].charAt(j)=='*') {
					if (j>R) {
						R = j;
					}
				}
			}

		}

		for (int i = N-1; i>=0; i--) {
			if (p[i].contains("*")) {
				if (i>B) {
					B = i;
				}
			}
		}

		for (int i = T; i<=B; i++) {
			System.out.println(p[i].substring(L, R+1));
		}





	}

}
