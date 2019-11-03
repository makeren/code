import java.io.*;
public class dmopc15c1p4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		String NX = br.readLine();
		String [] NXa = NX.split(" ");
		int N = Integer.parseInt(NXa[0]);
		int X = Integer.parseInt(NXa[1]);
		int total = 0;
		
		boolean [] notPrime = new boolean [N];
		for (int i = 2; i<N; i++) {
			if (false==notPrime[i]) {
				int tcount = N-i;
				if (tcount>0) {
					total += tcount/X+1;
					total += (tcount-1)/X+1;
				} else {
					total += tcount/X+1;
				}
				for (int j = 2*i; j<N; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		
		System.out.println(total);

	}

}
