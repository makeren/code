import java.util.*;

public class dwite11c5p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i<5; i++) {
            int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
            // 27/10/2010
            if ((2010-y>=13 && m<10) || (m==10 && 27>=d)) {
                System.out.println("old enough");
            } else {
                System.out.println("too young");
            }
        }



    }
}
