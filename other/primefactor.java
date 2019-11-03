import java.io.*;
import java.util.*;

public class primefactor {
    public static void main(String[] args) throws IOException {

        int N = nextInt();

        for (int q = 0; q<N; q++) {
            int M = nextInt();

            for (int i = 2; i<=Math.sqrt(M); i++) {
                while (M%i==0) {
                    System.out.print(i+" ");
                    M/=i;
                }
            }

            if (M!=1) {
                System.out.print(M);
            }

            System.out.println();

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
