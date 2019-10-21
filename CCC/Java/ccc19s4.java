import java.io.IOException;

public class ccc19s4 {
	public static int attraction [];
	public static int max = -1, K = 0, N = 0, sum = 0, rem = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		N = readInt(); K = readInt();
		rem = N%K;

		attraction = new int [N+1];
		
		for (int i = 1; i<=N; i++) attraction[i] = readInt();

		add(0, false);

		System.out.println(max);

	}
	
	public static int maxRange (int st, int range) {
		int max = 0;
		for (int i = st; i<=st+range; i++) {
			max = Math.max(attraction[i], max);
		}
		return max;
	}

	public static void add (int n, boolean used) {
		if (n==N) max = Math.max(sum, max);
		else {
			if (!used) {
				if (n+rem<=N) {
					int added = maxRange(n+1, rem-1);
					sum+=added;
					add(n+rem, true);
					sum-=added;
				}

				if (n+K<=N) {
					int added = maxRange(n+1, K-1);
					sum+=added;
					add(n+K, false);
					sum-=added;
				}

			} else if (n+K<=N) {
				int added = maxRange(n+1, K-1);
				sum+=added;
				add(n+K, true);
				sum-=added;
			}
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
}
