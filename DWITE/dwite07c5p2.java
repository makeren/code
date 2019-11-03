import java.io.*;

public class dwite07c5p2 {
    public static void main(String[] args) throws IOException {

        int [] factors = {2, 3, 5, 7, 11, 13};

        for (int q = 0; q<5; q++) {
            int n = readInt(), count = 0;

            for (int f:factors) {
                while (n!=f && n%f==0) {
                    n/=f;
                    count++;
                }
            }

            System.out.println(count==0 ? count:count+1);

        }

    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                num = true;
                ret = ret*10+c-'0';
                c = System.in.read();
            } else if (num) {
                break;
            }
        }

        return ret;

    }

}
