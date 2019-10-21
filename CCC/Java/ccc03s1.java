import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ccc03s1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int roll = Integer.parseInt(br.readLine());
		int square = 1;
		
		while (roll!=0) {
			if (square+roll<=100) {
				square = square+roll;
			}
			
			// snakes
			if (square==54) {
				square = 19;
			} else if (square==90) {
				square = 48;
			} else if (square==99) {
				square = 77;
			}
			
			//ladders
			
			if (square==9) {
				square = 34;
			} else if (square==40) {
				square = 64;
			} else if (square==67) {
				square = 86;
			}
			
			System.out.println("You are now on square "+square);
			
			if (square==100) {
				System.out.println("You Win!");
				break;
			}
			
			roll = Integer.parseInt(br.readLine());
		}
		
		if (roll==0) {
			System.out.println("You Quit!");
		}

	}

}
