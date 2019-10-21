import java.util.*;
public class ccc02s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double n = sc.nextInt();
		double d = sc.nextInt();

		double q = n/d;

		int min;
		if (n>d) {
			min = (int)d;
		} else {
			min = (int)n;
		}

		for (int i = min; i>1; i--) {
			if (n%i==0 && d%i==0) {
				n/=i;
				d/=i;
				break;
			}
		}

		if (q==(int)q) {
			System.out.println((int)q);
		} else if (q>0 && q<1) {
			System.out.println((int)n+"/"+(int)d);
		} else {
			double nn = n-(int)q*d;
			System.out.println((int)q+" "+(int)nn+"/"+(int)d);
		}

	}

}
