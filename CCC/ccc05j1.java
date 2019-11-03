import java.util.Scanner;

public class ccc05j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		long day = sc.nextLong();
		long night = sc.nextLong();
		long wknd = sc.nextLong();

		double A;
		if(day>100) {
			A = (day-100)*.25+night*.15+wknd*.20;
		} else {
			A = night*.15+wknd*.20;
		}
		
		A = Math.round(A*100);
		A = A/100;

		System.out.println("Plan A costs "+A);

		double B;
		if(day>250) {
			B = (day-250)*.45+night*.35+wknd*.25;
		} else {
			B = night*.35+wknd*.25;
		}
		
		B = Math.round(B*100);
		B = B/100;

		System.out.println("Plan B costs "+B);

		if(A<B) {
			System.out.println("Plan A is cheapest.");
		} else if(B<A) {
			System.out.println("Plan B is cheapest.");
		} else {
			System.out.println("Plan A and B are the same price.");
		}

	}

}
