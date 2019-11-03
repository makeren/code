import java.util.Scanner;

public class ccc02j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		if(a==1) {
			l3();l3();l3();
			System.out.println("");
			l3();l3();l3();
		} else if(a==2) {
			l1();l3();l3();l3();l1();l2();l2();l2();l1();
		} else if(a==3 ) {
			l1();l3();l3();l3();l1();l3();l3();l3();l1();
		} else if(a==4) {
			l4();l4();l4();l1();l3();l3();l3();
		} else if(a==5) {
			l1();l2();l2();l2();l1();l3();l3();l3();l1();
		} else if(a==6) {
			l1();l2();l2();l2();l1();l4();l4();l4();l1();
		} else if(a==7) {
			l1();l3();l3();l3();
			System.out.println("");
			l3();l3();l3();
		} else if(a==8) {
			l1();l4();l4();l4();l1();l4();l4();l4();l1();
		} else if (a==9) {
			l1();l4();l4();l4();l1();l3();l3();l3();l1();
		} else if (a==0) {
			l1();l4();l4();l4();
			System.out.println("");
			l4();l4();l4();l1();
		}


	}
	static void l1() {
		System.out.println(" * * *");
	}
	static void l2() {
		System.out.println("*");
	}
	static void l3() {
		System.out.println("      *");
	}
	static void l4() {
		System.out.println("*     *");
	}


}
