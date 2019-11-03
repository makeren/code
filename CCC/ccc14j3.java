import java.util.Scanner;

public class ccc14j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		int round = sc.nextInt();
		int [] a = new int[round+1];
		int [] d = new int[round+1];
		int as = 100;
		int ds = 100;
		String number;
		
		for(int i=0;i<round;i++) {
			number = sc.next();
			if (number.length() == 3){
				a[i]= (int) (number.charAt(0)) - (int) '0';
				d[i]= (int) (number.charAt(2))- (int) '0';
				if(a[i]>d[i]) {
					ds = ds-a[i];
				} else if (d[i]>a[i]) {
					as = as-d[i];
				}
			}
		}
		System.out.println(as);
		System.out.println(ds);


	}

}
