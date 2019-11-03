import java.util.Scanner;

public class ccc09j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte bt = sc.nextByte();
		byte np = sc.nextByte();
		byte yp = sc.nextByte();
		byte total = sc.nextByte();
		int count = 0;
		
		for (int i = 0; i*bt<=total; i++) {
			for (int j = 0; j*np<=total; j++) {
				for (int k = 0; k*yp<=total; k++) {
					if (i+j+k>0 && i*bt+j*np+k*yp<=total) {
						System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
						count++;
					}
				}
			}
		}
		
		System.out.println("Number of ways to catch fish: "+count);
		

	}

}
