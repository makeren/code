import java.util.*;
import java.io.*;

public class dpb {
    public static void main(String[] args) throws IOException {
        int N = nextInt(), K = nextInt();
        int[] rock = new int [N];
        int[] hop = new int [N];

        Arrays.fill(hop, 1<<30);
        hop[0] = 0;

        for (int i = 0; i<N; i++) {
            rock[i] = nextInt();
        }

        for (int i = 0; i<N; i++) {
            for (int k = 1; k<=K; k++) {
                if (i+k<N) {
                    hop[i + k] = Math.min(hop[i + k], hop[i] + Math.abs(rock[i + k] - rock[i]));
                }
            }
        }

        System.out.println(hop[N-1]);

    }

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static String nextLine() throws IOException {
        st = null;
        return in.readLine();
    }

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static char nextChar() throws IOException {
        return next().charAt(0);
    }

}
