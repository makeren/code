import java.util.*;
public class dmopc17c2p0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x1 = sc.nextInt(), y1 = sc.nextInt();
		int x2 = sc.nextInt(), y2 = sc.nextInt();
		int xs = sc.nextInt(), ys = sc.nextInt();
		int d = sc.nextInt();
		
		double s1 = Math.sqrt(Math.abs(x1-xs)*Math.abs(x1-xs)+Math.abs(y1-ys)*Math.abs(y1-ys));
		double s2 = Math.sqrt(Math.abs(x2-xs)*Math.abs(x2-xs)+Math.abs(y2-ys)*Math.abs(y2-ys));
		if (s1<=d || s2<=d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		

	}

}
