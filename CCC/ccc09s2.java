import java.io.*;
public class ccc09s2 {

    private static boolean [] twoStates;
    private static boolean [][] lights;
    private static int R, L;

    public static void main(String[] args) throws IOException {
        R = readInt(); L = readInt();
        lights = new boolean [R][L];
        twoStates = new boolean [L];

        for (int i = 0; i<R; i++) {
            for (int j = 0; j<L; j++) {
                int n = readInt();
                if (n==1) lights[i][j] = true;
                else lights [i][j] = false;
            }
        }



        // above(0, 0);

    }

//    private static boolean above (int row, int col) {
//        if (row==R-1) {
//            if (lights[row][col]) return true;
//        } else {
//
//        }
//
//    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
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
