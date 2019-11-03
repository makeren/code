import java.util.*;
public class tss17a {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i = 0; i<N; i++) {
            String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
            if (s1.equals(s2) || s1.equals(s3)) {
                System.out.println(s1);
            } else if (s2.equals(s3)) {
                System.out.println(s2);
            } else {
                System.out.println("???");
            }
        }

    }
}
