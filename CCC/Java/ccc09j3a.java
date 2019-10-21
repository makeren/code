import java.util.Scanner;

public class ccc09j3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int O = sc.nextInt();
		
		int hour = (O/100)*100;
		int minute = O%100;
		
		int V = O-300;
		if (V<0) {
			int V1=V*(-1);
			V=2400-V1;
		}
		int E = O-200;
		if (E<0) {
			int E1=E*(-1);
			E=2400-E1;
		}
		int W = O-100;
		if (W<0) {
			int W1=W*(-1);
			W=2400-W1;
		}
		int T = O;
		int H = O+100;
		
		int Sm = minute+30;
		if (Sm>59) {
			hour = hour+100;
			Sm = Sm-60;
		}
		int S = (hour+100)+Sm;

		
		System.out.println(O+" in Ottawa");
		System.out.println(V+" in Victoria");
		System.out.println(E+" in Edmonton");
		System.out.println(W+" in Winnipeg");
		System.out.println(T+" in Toronto");
		System.out.println(H+" in Halifax");
		System.out.println(S+" in St. John's");

	}

}