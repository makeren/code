import java.io.*;
import java.util.*;

public class dpc {
    public static void main(String[] args) throws IOException {

        int N = nextInt();
        int[][] fun = new int [N][3];

        for (int i = 0; i<N; i++) {
            for (int j = 0; j<3; j++) {
                fun[i][j] = nextInt();
            }
        }

        for (int i = 1; i<N; i++) {
            fun[i][0] = Math.max(fun[i-1][1]+fun[i][0], fun[i-1][2]+fun[i][0]);
            fun[i][1] = Math.max(fun[i-1][0]+fun[i][1], fun[i-1][2]+fun[i][1]);
            fun[i][2] = Math.max(fun[i-1][1]+fun[i][2], fun[i-1][0]+fun[i][2]);
        }

        int bigfun = Math.max(fun[N-1][0], fun[N-1][1]);
        bigfun = Math.max(bigfun, fun[N-1][2]);

        System.out.println(bigfun);



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
