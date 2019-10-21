import java.util.*;
public class nccc7j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] letters1 = new int [26];
		int [] letters2 = new int [26];
		String message = sc.nextLine();
		String candles = sc.nextLine();
		
		for (int i = 0; i<message.length(); i++) {
			letters1[message.charAt(i)-'A']++;
		}
		for (int i = 0; i<candles.length(); i++) {
			letters2[candles.charAt(i)-'A']++;
		}
		
		int count = 0;
		for (int i = 0; i<26; i++) {
			int dif = letters2[i] - letters1[i];
			if (dif<0) {
				count+=Math.abs(dif);
			}
		}
		
		System.out.println(count);

	}

}
