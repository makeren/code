import java.io.*;
import java.util.StringTokenizer;
public class nccc6s4hard {
	static int dp[];
	static int a, b, c, d;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		a = readInt();
		b = readInt();
		c = readInt();
		d = readInt();
		int Q = readInt();
		
		dp = new int [10000001];
		for (int i = 0; i<10000000; i++) {
			int count1 = 0, count2 = 0;
			if(i/a-b>0) {
				count1 = dp[i/a-b];
			} else {
				count1 = 1;
			}
			if (i/c-d>0) {
				count2 = dp[i/c-d];
			} else {
				count2 = 1;
			}
			dp[i] = count1 + count2;
		}
		while (Q-->0) {
			int x = readInt();
			System.out.println(rec(x));
		}

	}

	static int rec (int x) {
		if (x<=0) {
			return 1;
		}
		if (x<10000001) {
			return dp[x];
		}
		return rec(x/a-b) + rec(x/c-d);
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static float readFloat() throws IOException {
		return Float.parseFloat(next());
	}

	static boolean readBool() throws IOException {
		return Boolean.parseBoolean(next());
	}

	static short readShort() throws IOException {
		return Short.parseShort(next());
	}

	static byte readByte() throws IOException {
		return Byte.parseByte(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readChar() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		br.close();
		pr.close();
		System.exit(0);
	}
}
