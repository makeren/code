import java.util.Scanner;

public class ccc07j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] cases = new int [11];
		cases[1] = 100;
		cases[2] = 500;
		cases[3] = 1000;
		cases[4] = 5000;
		cases[5] = 10000;
		cases[6] = 25000;
		cases[7] = 50000;
		cases[8] = 100000;
		cases[9] = 500000;
		cases[10] = 1000000;
		
		double total = 0;
		for(int i = 1;i<11;i++) {
			total = total+cases[i];
		}
		
		int ncases = sc.nextInt();
		double ocases = 0;
		
		for(int i = 1;i<=ncases;i++) {
			ocases = sc.nextInt();
			total = total-cases [(int) ocases];
		}
		
		total = total/(10-ncases);
		int banker = sc.nextInt();
		
		if(banker>total) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}
		

	}

}
