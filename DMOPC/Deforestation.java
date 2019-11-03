import java.io.*;
public class Deforestation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		int psa [] = new int [N+1];
		for (int i = 1; i<N+1; i++) {
			psa[i] = psa[i-1]+readInt();
		}
		int Q = readInt();
		for (int i = 0; i<Q; i++) {
			int a = readInt(), b = readInt();
			System.out.println(psa[b+1]-psa[a]);
		}

	}

	public static int readInt() throws IOException {
		int ret = 0, c = System.in.read();
		boolean num = false;
		while (c!=10) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret*10+c-'0';
			} else break;
			c = System.in.read();
		}
		return ret;
	}

}
