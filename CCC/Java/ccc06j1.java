import java.util.Scanner;

public class ccc06j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int [] b  = new int [4];
		b[1] = 461;
		b[2] = 431;
		b[3] = 420;

		int [] s  = new int [4];
		s[1] = 100;
		s[2] = 57;
		s[3] = 70;
		
		int [] d  = new int [4];
		d[1] = 130;
		d[2] = 160;
		d[3] = 118;
		
		int [] de  = new int [4];
		de[1] = 167;
		de[2] = 266;
		de[3] = 75;
		
		int cc = 0;
		
		int o = sc.nextInt();
		if (o<4) {
			cc+=b[o];
		}
		
		o = sc.nextInt();
		if (o<4) {
			cc+=s[o];
		}
		
		o = sc.nextInt();
		if (o<4) {
			cc+=d[o];
		}
		
		o = sc.nextInt();
		if (o<4) {
			cc+=de[o];
		}
		
		System.out.println("Your total Calorie count is "+cc+".");

	}

}
