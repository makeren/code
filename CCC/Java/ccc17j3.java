import java.util.*;
public class ccc17j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x1 = sc.nextInt(), y1 = sc.nextInt();
		int x2 = sc.nextInt(), y2 = sc.nextInt();
		int f = sc.nextInt();
		int d = Math.abs(x1-x2) + Math.abs(y1-y2);

		if (f-d>=0) {
			if ((f-d)%2==0) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		} else {
			System.out.println("N");
		}

	}

}
