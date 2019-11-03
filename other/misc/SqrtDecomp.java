import java.util.*;
import java.io.*;
public class SqrtDecomp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		int [] A = new int [N];
		for (int i = 0 ; i<N; i++) A[i] = readInt();

		int root = (int) Math.sqrt(N);
		int [] mins = new int [root+3];
		Arrays.fill(mins, Integer.MAX_VALUE);
		for (int i = 0; i<root; i++) {
			for (int j = root*i; j<root*i+root; j++) {
				mins[i] = Math.min(mins[i], A[j]);
			}
		}

		for (int q = 0; q<M; q++) {
			String s = read();
			int a = readInt(), b = readInt();

			if (s.equals("M")) {
				A[a] = b;
				mins[a/root] = Math.min(mins[a/root], b);
//				mins[a/root] = Integer.MAX_VALUE;
//				for (int j = a; j < root+a && j < N; j++) {
//					mins[a/root] = Math.min(A[j], mins[a/root]);
//				}
			} else {
				int min = Integer.MAX_VALUE;
				for (int i = a; i<=b; i++) {
					if (i%root==0 && i+root<=b) {
						min = Math.min(min, mins[i/root]);
						i+=root; i--;
					} else {
						min = Math.min(min, A[i]);
					}
				}
				System.out.println(min);
			}
		}
	}

	final private static int BufferS = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BufferS];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BufferS);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	public static String read() throws IOException {
		byte[] ret = new byte[1024];
		int idx = 0;
		byte c = Read();
		while (c <= ' ') {
			c = Read();
		}
		do {
			ret[idx++] = c;
			c = Read();
		} while (c != -1 && c != ' ' && c != '\n' && c != '\r');
		return new String(ret, 0, idx);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

}
