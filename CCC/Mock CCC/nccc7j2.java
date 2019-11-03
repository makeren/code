import java.util.*;
public class nccc7j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean jelly = false;
		int count = 0;
		String s = "";
		for (int i = 0; i<7; i++) {
			s = sc.next();
			if (s.equals("J")) jelly = true;
			if (s.equals("T") && jelly) {
				count++;
				jelly = false;
			}
		}
		if (jelly) count++;
		
		System.out.println(count);

	}

}
