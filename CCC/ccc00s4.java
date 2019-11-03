import java.io.*;
import java.util.*;

public class ccc00s4 {

    public static void main(String[] args) throws IOException {

        int d = readInt(), n = readInt();
        int distance [] = new int [d+1];
        int clubs [] = new int [n];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        for (int i = 0; i<n; i++) {
            clubs[i] = readInt();
        }

        for (int i = 0; i<d; i++) {

            for (int j = 0; j<n; j++) {

                int cur = i+clubs[j];
                if (cur<=d && distance[i]!=Integer.MAX_VALUE) {
                    distance[cur] = Math.min(distance[i]+1, distance[cur]);
                }

            }
        }

        if (distance[d]<Integer.MAX_VALUE) {
            System.out.println("Roberta wins in "+distance[d]+" strokes.");
        } else {
            System.out.println("Roberta acknowledges defeat.");
        }

    }

    public static int readInt() throws IOException {

        int ret = 0, c = System.in.read();
        boolean num = false;
         while (true) {
             if (c>='0' && c<='9') {
                 num = true;
                 ret = ret*10 + c - '0';
                 c = System.in.read();

             } else if (num) break;
         }

         return ret;
    }

}
