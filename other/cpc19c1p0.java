import java.util.*;

public class cpc19c1p0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] shoes = sc.nextLine().split(" ");


        int used = 0;

        for (int i = 1; i < 4; i++) {
            if (!shoes[0].equals(shoes[i])) {
                used = i;
                System.out.println(1 + " " + (i+1));
                break;
                }
            }

        if (used==1) {
          System.out.println("3 4");
        } else if (used==2){
            System.out.println("2 4");
        } else System.out.println("2 3");
    }
}