import java.util.Scanner;

public class ccc12j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();

		String S1 = "*x*";
		String S2 = " xx";
		String S3 = "* *";

		for(int h=0;h<k;h++) {
			for(int i=0;i<S1.length();i++) {
				for(int j =0;j<k;j++) {
					System.out.print(S1.charAt(i));
				}
			}
			System.out.println();
		}

		for(int a=0;a<k;a++) {
			for(int b=0;b<S1.length();b++) {
				for(int c=0;c<k;c++) {
					System.out.print(S2.charAt(b));
				}
			}
			System.out.println();
		}
	
		for(int x=0;x<k;x++) {
			for(int y=0;y<S1.length();y++) {
				for(int z=0;z<k;z++) {
					System.out.print(S3.charAt(y));
				}
			}
			System.out.println();
		}
		
	}

}
