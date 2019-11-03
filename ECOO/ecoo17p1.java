import java.util.*;
import java.io.*;
public class ecoo17p1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader ("DATA11.txt"));
		while (sc.hasNext()) {
			int cost = sc.nextInt();
			double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
			int N = sc.nextInt();

			a*=N*12;
			b*=N*10;
			c*=N*7;
			d*=N*5;

			if ((a+b+c+d)/2>=cost) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
