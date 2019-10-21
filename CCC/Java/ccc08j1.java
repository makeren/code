import java.util.Scanner;

public class ccc08j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		

		if (weight/(height*height)<18.5) {
			System.out.println("Underweight");
		} else if (weight/(height*height)>=18.5 && weight/(height*height)<=25) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Overweight");
		}
	}

}
