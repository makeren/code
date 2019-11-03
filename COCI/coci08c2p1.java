import java.util.*;
public class coci08c2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] s = new int [4];
		for (int i = 0; i<4; i++) {
			s[i] = sc.nextInt();
		}
		
		Arrays.sort(s);
		
		System.out.println(s[0]*s[2]);

	}

}
