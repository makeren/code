import java.util.*;
public class GPSTextEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		char [] S = sc.nextLine().toCharArray();
		int r = 0;
		int c = 0;
		int move = 0;
		
		for (int i = 0; i<S.length; i++) {
			int dis = S[i] - 'A';
			int nr = dis/6;
			int nc = dis%6;
			if (S[i]==' ') {
				nr = 4;
				nc = 2;
			} else if (S[i]=='-'){
				nr = 4;
				nc = 3;
			} else if (S[i]=='.') {
				nr = 4;
				nc = 4;
			}
			move+= Math.abs(nr-r) + Math.abs(nc-c);
			r = nr;
			c = nc;
		}
		
		move+= Math.abs(4-r) + Math.abs(5-c);
		System.out.println(move);
	

	}

}
