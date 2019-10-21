import java.util.*;
public class ccc05s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		long c = sc.nextInt(), r = sc.nextInt();
		long a = sc.nextInt(), b = sc.nextInt();
		long x = 0; long y = 0;
		while (true) {
			if (a==0 && b==0) {
				break;
			}
			
			x+=a;
			if (x<0) {
				x = 0;
			} else if (x>c) {
				x = c;
			}
			
			y+=b;
			if (y<0) {
				y = 0;
			} else if (y>r) {
				y = r;
			}
			
			System.out.println(x+" "+y);
			a = Long.parseLong(sc.next());
			b = Long.parseLong(sc.next());

		}

	}

}
