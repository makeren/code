import java.util.*;

public class dwite09c1p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int q = 0; q<5; q++) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 0; i<N; i++) {
                sum+=sc.nextInt();
            }
            int ans = (2+N)*(N+1)/2-sum;
            System.out.println(ans);
        }

    }
}
