import java.util.*;
public class ccc16j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r11 = sc.nextInt(), r12 = sc.nextInt(), r13 = sc.nextInt(), r14 = sc.nextInt();
		int r21 = sc.nextInt(), r22 = sc.nextInt(), r23 = sc.nextInt(), r24 = sc.nextInt();
		int r31 = sc.nextInt(), r32 = sc.nextInt(), r33 = sc.nextInt(), r34 = sc.nextInt();
		int r41 = sc.nextInt(), r42 = sc.nextInt(), r43 = sc.nextInt(), r44 = sc.nextInt();

		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		int csum1 = 0, csum2 = 0, csum3 = 0, csum4 = 0;

		sum1 = r11+r12+r13+r14;
		sum2 = r21+r22+r23+r24;
		sum3 = r31+r32+r33+r34;
		sum4 = r41+r42+r43+r44;


		if (sum1==sum2 && sum2==sum3 && sum3==sum4) {
			csum1 = r11+r21+r31+r41;
			csum2 = r12+r22+r32+r42;
			csum3 = r13+r23+r33+r43;
			csum4 = r14+r24+r34+r44;
			if (csum1==csum2 && csum2==csum3 && csum3==csum4 && csum1==sum1) {
				System.out.println("magic");
			} else {
				System.out.println("magic");
			}
		} else {
			System.out.println("not magic");
		}


	}

}
