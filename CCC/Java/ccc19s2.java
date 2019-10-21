import java.io.*;

public class ccc19s2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int T = readInt();
		int a = 0, b = 0;

		for (int i = 0; i<T; i++) {
			int N = readInt()*2;
			boolean flag = false;
			for (int j = 2; j<N-1; j++) {
				if (prime(j)) {
					if (prime(N-j)) {
						a = j;
						b = N-j;
						flag = true;
					}
				}
				if (flag) break;
			} 
			System.out.println(a+" "+b);
		}

	}

	public static boolean prime (int n) {
		for (int i = 2; i<=Math.sqrt(n)+1; i++) {
			if (n%i==0) return false;
		}
		return true;
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
