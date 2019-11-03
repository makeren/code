import java.io.*;

public class dmopc18c5p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String [] ln = br.readLine().split(" ");

        int N = Integer.parseInt(ln[0]);
        long M = Long.parseLong(ln[1]);

        long [] psa = new long [N+1];

        ln = br.readLine().split(" ");

        for (int i = 1; i<=N; i++) {
            psa[i] = psa[i-1]+Integer.parseInt(ln[i-1]);
        }

        int l = 0, r = 1, max = 0;

        while (l<=r && r<=N) {
            if (psa[r]-psa[l]<M) {
                max = Math.max(max, r-l);
                r++;

            } else {
                l++;
            }
        }

        System.out.println(max);



    }

}
