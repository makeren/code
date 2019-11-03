import java.util.*;

public class combinations {
    public static void main(String[] args) {

        int [] a = {1, 1, 1};
        Arrays.sort(a);
        List<Integer> sol = new ArrayList<>();
        fun(0, a, sol);

    }

    private static void fun (int cur, int [] a, List<Integer> sol) {
        if (cur == a.length) {
            System.out.println(sol);
            return;
        }

        fun(cur+1, a, sol); // don't take cur
        sol.add(a[cur]); fun(cur+1, a, sol); sol.remove(sol.size()-1); // take cur (then remove it later)


    }

}
