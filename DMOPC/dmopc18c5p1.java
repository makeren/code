import java.util.*;
public class dmopc18c5p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
		String nb = "0000000000000000"+Integer.toBinaryString(N), mb = "0000000000000000"+Integer.toBinaryString(M);
		
		int blue = 0, purple = 0;
		
		for (int i = 1; i<=K; i++) {
			boolean flag1 = false, flag2 = false;
			if (nb.charAt(nb.length()-i)=='1') flag1 = true;
			if (mb.charAt(mb.length()-i)=='1') flag2 = true;
			if ((flag1 && !flag2) || (!flag1 && flag2)) {
				blue++;
			} else purple++;
		}
		
		System.out.println(blue+" "+purple);
		

	}

}
