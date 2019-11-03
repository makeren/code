import java.io.*;
import java.util.*;

public class bts19p1 {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        String [] word = new String [N];
        for (int i = 0; i<N; i++) {
            word[i] = next();
        }
        String replaced = next();

        int length = 0; String good = "";

        for (int i = 0; i<N; i++) {
            if (word[i].length()<=replaced.length() && word[i].length()>length) {
                length = word[i].length();
                good = word[i];
            }

        }

        System.out.println(good);


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


}
