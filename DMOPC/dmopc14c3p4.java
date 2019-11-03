import java.io.*;
import java.util.*;

public class dmopc14c3p4 {

    private static int [] factors = new int [100001];
    private static ArrayList <Integer> [] num = new ArrayList [100001];

    public static void main(String[] args) throws IOException {

        for (int i = 0; i<100001; i++) {
            num[i] = new ArrayList<Integer>();
        }

        Arrays.fill(factors, 2);
        factors[1] = 1;
        num[1].add(1);

        for (int i = 2; i<=50000; i++) {
            for (int j = i*2; j<=100000; j+=i) {
                factors[j]++;
            }
        }

        for (int i = 2; i<=100000; i++) {
            num[factors[i]].add(i);
        }

        int T = readInt();

        for (int q = 0; q<T; q++) {
            int K = readInt(), A = readInt(), B = readInt();

            if (K==1 && A==1) {
                System.out.println(1);
            } else {
                int start = binsearchup(num[K], A);
                int end = binsearchlow(num[K], B);

                System.out.println(end - start + 1);


            }

        }


    }

    private static int binsearchup (ArrayList <Integer> arr, int key) {

        int l = 0, r = arr.size()-1;

        while (l<=r) {
            int mid = l+(r-l+1)/2;

            if (arr.get(mid)==key) {
                return mid;
            }

            if (arr.get(mid)<key) {
                l = mid+1;

            } else {
                r = mid-1;
            }
        }

        return l;

    }

    private static int binsearchlow (ArrayList <Integer> arr, int key) {

        int l = 0, r = arr.size()-1;

        while (l<=r) {
            int mid = l+(r-l)/2;

            if (arr.get(mid)==key) {
                return mid;
            }

            if (arr.get(mid)<key) {
                l = mid+1;

            } else {
                r = mid-1;
            }
        }

        return l-1;

    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                num = true;
                ret = ret * 10 + c - '0';
                c = System.in.read();

            } else if (num) {
                break;
            }

        }

        return ret;

    }

}
