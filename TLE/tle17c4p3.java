import java.io.*;

public class tle17c4p3 {

    private static int [] requiredFor;
    private static int [] itemsNeeded;

    public static void main(String[] args) throws IOException {

        // each item is used once, so create array of ingredients where value at index (index is item) is target item
        // second array where index is target item and value is number of items (subtract from)

        int N = readInt(), M = readInt(), D = readInt(), day = 0;

        requiredFor = new int [N+1];
        itemsNeeded = new int [N+1];

        for (int i = 0; i<M; i++) {
            int target = readInt(), req = readInt();
            itemsNeeded[target] = req;

            for (int j = 0; j<req; j++) {
                int item = readInt();
                requiredFor[item] = target;
            }

        }

        while (itemsNeeded[1]>0 && day<D) {
            int item = readInt();
            itemsNeeded[item] = 0;

            if (requiredFor[item]!=0) {
                check(item);
            }

            day++;

        }

        if (itemsNeeded[1]>0) {
            System.out.println(-1);
        } else {
            System.out.println(day);
        }

    }

    private static void check (int item) {

        int target = requiredFor[item];
        requiredFor[item] = 0;

        if (itemsNeeded[target]>0) {
            itemsNeeded[target]--;

            if (itemsNeeded[target] == 0 && target>1) {
                check(target);

            }
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {

            if (c>='0' && c<='9') {
                ret = ret*10 + c - '0';
                num = true;
                c = System.in.read();

            } else if (num) {
                break;
            }

        }

        return ret;
    }
}
