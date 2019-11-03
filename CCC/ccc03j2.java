import java.util.*;

public class ccc03j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int C = sc.nextInt();
		int l = 0;
		int w = 0;

		
			while (C!=0) {
				boolean flag = (true);
				for (int j = (int)Math.sqrt(C); j>0; j--) {
					for (int i = (int)Math.sqrt(C); i<=C; i++) {
						if (i*j==C) {
							l = i;
							w = j;
							flag = false;
							break;
						}
					}
					if (flag==false) {
						break;
					}
				}
				System.out.println("Minimum perimeter is "+(l*2+w*2)+" with dimensions "+w+" x "+l);

				C = sc.nextInt();
			}

	}

}
