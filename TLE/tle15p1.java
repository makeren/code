import java.io.*;
import java.util.*;

public class tle15p1 {

    public static class Rank implements Comparable <Rank>{
        String name;
        int min;

        private Rank (String name, int min) {
            this.name = name;
            this.min = min;
        }

        @Override
        public int compareTo(Rank o) {
            if (this.min>o.min) return 1;
            else if (this.min<o.min) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt(), P = nextInt();
        Rank [] student = new Rank [N];

        for (int i = 0; i<N; i++) {
            student[i] = new Rank(nextLine(), 0);
        }

        for (int i = 0; i<P; i++) {
            for (int j = 0; j<N; j++) {
                student[j].min+=nextInt();
            }
        }

        Arrays.sort(student);

        for (int i = 0; i<N; i++) {
            System.out.println(i+3+". "+student[N-1-i].name);
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

}
