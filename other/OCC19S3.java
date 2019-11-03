import java.io.*;
import java.util.*;

public class OCC19S3 {
    public static void main(String[] args) throws IOException {
        int T = nextInt();

        for (int t = 0; t<T; t++) {
            String S = next(), s1 = S, s2 = S;

            while (s1.contains("NAN") || s1.contains("NA")) {
                while (s1.contains("NAN")) {
                    s1 = s1.replace("NAN", "N");
                }
                s1 = s1.replace("NA", "N");
            }

            while (s2.contains("NAN") || s2.contains("NA") || s2.contains("AN")) {
                while (s2.contains("NAN")) {
                    s2 = s2.replace("NAN", "N");
                }

                while (s2.contains("NA")) {
                    s2 = s2.replace("NA", "N");
                }

                while (s2.contains("AN")) {
                    s2 = s2.replace("AN", "N");
                }
            }

            if (s1.equals("N")) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }

            if (s2.equals("N") || s1.equals("N")) {
                System.out.print(1 + "\n");
            } else {
                System.out.print(0 + "\n");
            }
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

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

}
