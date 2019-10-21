import java.util.*;
public class ccc12j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int limit = sc.nextInt();
		int over = sc.nextInt()-limit;
		
		if (over<1) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (over<21) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (over<31) {
			System.out.println("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
		

	}

}
