import java.util.*;
public class dmopc18c5p0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		
		double r1 = sc.nextDouble(), g1 = sc.nextDouble(), b1 = sc.nextDouble();
		double r2 = sc.nextDouble(), g2 = sc.nextDouble(), b2 = sc.nextDouble();
		
		if (s.equals("Multiply")) {
			System.out.println(r1*r2+" "+g1*g2+" "+b1*b2);
		} else if (s.equals("Screen")) {
			System.out.println((1-(1-r1)*(1-r2))+" "+(1-(1-g1)*(1-g2))+" "+(1-(1-b1)*(1-b2)));
		} else {
			if (r1<0.5) {
				System.out.print(2*r1*r2+" ");
			} else if (r1>=0.5) {
				System.out.print(1-2*(1-r1)*(1-r2)+" ");
			}
			if (g1<0.5) {
				System.out.print(2*g1*g2+" ");
			} else if (g1>=0.5) {
				System.out.print(1-2*(1-g1)*(1-g2)+" ");
			}
			if (b1<0.5) {
				System.out.print(2*b1*b2+" ");
			} else if (b1>=0.5) {
				System.out.print(1-2*(1-b1)*(1-b2)+" ");
			}
		}

	}
	

}
