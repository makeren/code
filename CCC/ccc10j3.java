import java.util.*;
public class ccc10j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int A = 0, B = 0;

		while (true) {
			String n = sc.nextLine();
			char n1 = n.charAt(0);
			if (n1=='7') break;
			char n2 = n.charAt(2);
			char n3;

			if (n1 == '1') {
				n3 = n.charAt(4);
				if (n2=='A') {
					A = Integer.parseInt(n.substring(4, n.length()));
				} else {
					B = Integer.parseInt(n.substring(4, n.length()));
				}
			} else if (n1 == '2') {
				if (n2=='A') {
					System.out.println(A);
				} else {
					System.out.println(B);
				}
			} else if (n1 == '3') {
				n3 = n.charAt(4);
				if (n2=='A') {
					if (n3=='A') {
						A+=A;
					} else {
						A+=B;
					}
				} else {
					if (n3=='A') {
						B+=A;
					} else {
						B+=B;
					}
				}
			} else if (n1 == '4') {
				n3 = n.charAt(4);
				if (n2=='A') {
					if (n3=='A') {
						A*=A;
					} else {
						A*=B;
					}
				} else {
					if (n3=='A') {
						B*=A;
					} else {
						B*=B;
					}
				}
			} else if (n1 == '5') {
				n3 = n.charAt(4);
				if (n2=='A') {
					if (n3=='A') {
						A-=A;
					} else {
						A-=B;
					}
				} else {
					if (n3=='A') {
						B-=A;
					} else {
						B-=B;
					}
				}
			} else if (n1 == '6') {
				n3 = n.charAt(4);
				if (n2=='A') {
					if (n3=='A') {
						A/=A;
					} else {
						A/=B;
					}
				} else {
					if (n3=='A') {
						B/=A;
					} else {
						B/=B;
					}
				}
			}

		}

	}


}
