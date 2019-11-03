import java.io.*;
import java.util.*;

public class fhc15c1p1 {
    public static void main(String[] args) throws IOException {

        int [] primes = new int [10000001];

        for (int i = 2; i<=10000000; i++) {
            if (primes[i]==0) {
                for (int j = i; j<=10000000; j+=i) {
                    primes[j]++;
                }
            }
        }

        int T = nextInt();

        for (int q = 1; q<=T; q++) {
            int A = nextInt(), B = nextInt(), K = nextInt(), count = 0;
            for (int i = A; i<=B; i++) {
                if (primes[i]==K) {
                    count++;
                }
            }

            System.out.println("Case #"+q+": "+count);
        }

    }

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    private static String nextLine() throws IOException {
        st = null;
        return in.readLine();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static char nextChar() throws IOException {
        return next().charAt(0);
    }



}
