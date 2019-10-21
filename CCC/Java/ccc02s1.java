import java.util.*;
public class ccc02s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int g = sc.nextInt();
		int r = sc.nextInt();
		int o = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int min = m;

		for (int i = 0; i*p<=m; i++) {
			for (int j = 0; j*g<=m; j++) {
				for (int k = 0; k*r<=m; k++) {
					for (int l = 0; l*o<=m; l++) {
						int sum = i+j+k+l;
						if (i*p+j*g+k*r+l*o==m) {
							System.out.println("# of PINK is "+i+" # of GREEN is "+j+" # of RED is "+k+" # of ORANGE is "+l);
							count++;
							if (sum<min) {
								min = sum;
							}
						}
					}
				}
			}
		}
		System.out.println("Total combinations is "+count+".");
		System.out.println("Minimum number of tickets to print is "+min+".");

	}

}
