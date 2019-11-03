import java.io.*;
import java.util.*;

public class mwc15c2p2 {
    //stack ugh
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int [] tower = new int [N];
        int [] seen = new int [N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i<N; i++) {
            tower[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print("0 1 ");
        seen[0] = 0;
        seen[1] = 1;

        for (int i = 2; i<N; i++) {

              for (int j = i-1; j>=0; j--) {

                  seen[i]++;

                  if (tower[j]>tower[i]) {
                      break;

                  } else if (tower[j]==tower[i]) {
                      seen[i]+=seen[j];
                      break;
                  }

              }

            System.out.print(seen[i]+" ");

        }



    }
}
