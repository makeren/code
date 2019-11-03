import java.io.*;

public class dmopc18c5p2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		
		double pic [][] = new double [N][M];
		double C = 0, mean = 0;

		for (int i = 0; i<N; i++) {
			for (int j = 0; j<M; j++) {
				double temp = readDouble();
				pic[i][j] = temp;
				mean+=temp;
			}
		}

		mean/=(M*N);

		if (mean<0.48) System.out.println("underexposed");
		else if (mean==0.48) System.out.println("correctly exposed");
		else System.out.println("overexposed");

		if (mean!=0.48) {
			double goal = 0.48*M*N;
			double accepted = 0;
			C = 0.48/mean;
			for (int i = 0; i<N; i++) {
				for (int j = 0; j<M; j++) {
					double temp = pic[i][j]*C;
					if (temp>1) goal-=1.0;
					else accepted+=pic[i][j];
				}
			}
			C = goal/accepted;
			System.out.println(C);
		}

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
	
	private static double readDouble() throws IOException {
		double ret = 0, factor = 1;
		int c = System.in.read();
		boolean dig = false, decimal = false;
		while (c!=13 && c!=10 && c!=32) {
			if (dig && c=='.') decimal = true;
			if (c>='0' && c<='9') {
				dig = true;
				if (decimal) {
					factor/=10;
					ret+=(c-'0')*factor;
				} else ret = ret * 10 + c - '0';
			} else if (dig && !decimal) break;
			c = System.in.read();
		}

		return ret;
	}

}
