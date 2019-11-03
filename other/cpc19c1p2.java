import java.io.*;
import java.util.*;

public class cpc19c1p2 {
    public static int [] items;

    public static void main(String[] args) throws IOException {

        int N = readInt(), K = readInt();
        items = new int [N];

        for (int i = 0; i<N; i++) {
            items[i] = readInt();
        }

        Arrays.sort(items);

        int range = 1;

        for (int cur = 0; cur<N-1; cur++) {
            int max = items[cur]+K;

            int index = search(cur, N-1, max);

            range = Math.max(range, index-cur+1);
        }

        System.out.println(range);

    }

    public static int search (int l, int r, int max) {
        if (r>=l) {
            int mid = (l+r-1)/2;
            if (l==r) mid = l;
            if (items[mid]==max || (items[mid]<max && (mid+1>r || items[mid+1]>max))) {
                return mid;
            } else if (items[mid]>max && items[mid-1]<max) {
                return mid-1;
            } else if (items[mid]<max) {
                return search(mid+1, r, max);
            } else if (items[mid]>max) {
                return search(l, mid-1, max);
            }
        }

        return -1;

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
