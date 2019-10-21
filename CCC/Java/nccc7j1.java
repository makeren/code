import java.util.*;
public class nccc7j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int count = 0;
		for (int i = 0; i<5; i++) {
			String s = sc.next();
			if (s.equals("P")) count++;
		}
		System.out.println(count);

	}

}
