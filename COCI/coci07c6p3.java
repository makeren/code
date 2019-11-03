import java.io.*;
import java.util.*;


public class coci07c6p3 {
    public static void main(String[] args) throws IOException {

        int N = nextInt();
        int[] num = new int[N];
        int[] diff = new int[N - 1];

        for (int i = 0; i < N; i++) {
            num[i] = nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            diff[i] = Math.abs(num[i + 1] - num[i]);
        }

        Arrays.sort(diff);

        ArrayList<Integer> factors = new ArrayList<>();

        int small = diff[0];

        for (int i = 2; i <= Math.sqrt(small); i++) {
            if (small % i == 0) {
                factors.add(i);
                if (i * i != small) {
                    factors.add(small / i);
                }
            }
        }

        factors.add(diff[0]);


        for (int i = 1; i < N - 1; i++) {
            int index = 0;

            while (index < factors.size()) {
                if (diff[i] % factors.get(index) != 0) {
                    factors.remove(index);

                } else {
                    index++;
                }
            }

        }

        for (int i = 0; i < factors.size() - 1; i++) {
            System.out.print(factors.get(i) + " ");
        }

        System.out.println(factors.get(factors.size() - 1));

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