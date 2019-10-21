import java.util.Scanner;

public class ccc09j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int O = sc.nextInt();
		
		int hour = (O/100)*100;
		int minute = O%100;
		
		int V = O-300;
		if (V<0) {
			V+=2400;
		}
		
		int E = O-200;
		if (E<0) {
			E+=2400;
		}
		int W = O-100;
		if (W<0) {
			W+=2400;
		}
		
		int T = O;
		
		
		int Hh = hour+100;
		
		if (Hh>2300) {
			Hh-=2400;
		}
		
		int H = Hh+minute;
		
		
		
		int Sm = minute+30;
		int Sh = hour+100;
		if (Sm>59) {
			Sh += 100;
			Sm -= 60;
		}
		if (Sh>2300) {
			Sh-=2400;
		}
		int S = Sh+Sm;

		
		System.out.println(O+" in Ottawa");
		System.out.println(V+" in Victoria");
		System.out.println(E+" in Edmonton");
		System.out.println(W+" in Winnipeg");
		System.out.println(T+" in Toronto");
		System.out.println(H+" in Halifax");
		System.out.println(S+" in St. John's");
		

	}

}
