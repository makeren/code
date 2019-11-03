import java.io.*;

public class cpc19c1p1 {
    public static void main(String[] args) throws IOException {

        int N = readInt();
        double mid = N/2.0;
        if (mid != (int)mid) mid = (int)mid+1;

        int diff = 1;

        int cur = (int) mid;

        System.out.print(cur+" ");

        for (int i = 0; i<N-1; i++) {
            cur = (int) (cur+diff);
            System.out.print(cur+" ");

            if (diff<0) {
                diff = Math.abs(diff)+1;
            } else {
                diff = (diff+1)*-1;
            }

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
