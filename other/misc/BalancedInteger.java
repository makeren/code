import java.util.*;
public class BalancedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] list = new int [9*9*9];
		int k = sc.nextInt();
		
		for (int a = 1; a<10; a++) {
			for (int b = 1; b<10; b++) {
				for (int c = 1; c<10; c++) {
					int count = 0;
					for (int d = 1; d<10; d++) {
						for (int e = 1; e<10; e++) {
							for (int f = 1; f<10; f++) {
								if (a*b*c==d*e*f) {
									list[count] = a*100000+b*10000+c*1000+d*100+e*10+f;
									count++;
								}
							}
						}
					}
					if (count==k) {
						System.out.println("For the integer abcdef, where abc is "+(a*100+b*10+c)+", there are "+k+" balanced integers. These are:");
						for (int i = 0; i<count; i++) {
							System.out.println(list[i]);
						}
						System.out.println("\n-----------------------------------------------------------------------------------\n");
					}
				}
			}
		}

	}

}
