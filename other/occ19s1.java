import java.io.*;
import java.util.*;

public class occ19s1 {

    public static void main(String[] args) throws IOException {


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
