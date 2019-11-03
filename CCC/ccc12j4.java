import java.util.*;
public class ccc12j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int k = sc.nextInt();
		String s = sc.next();
		char [] decoded = new char [s.length()];
		
		for (int i = 0; i<s.length(); i++) {
			//take character
			int temp = s.charAt(i);
			
			//undo operation:
			//s = 3p+k
			//s = how many letters to move forward
			//p = position
			//k = input
			temp-=3*(i+1)+k;

			//loop back around
			if (temp<65) {
				while (temp<65) {
					int ttemp = temp-65;
					temp = 91+ttemp;
				}
			}
			
			//put in array
			decoded[i] = (char)temp;
			
		}
		
		for (int i = 0; i<decoded.length; i++) {
			System.out.print(decoded[i]);
		}
	}

}
