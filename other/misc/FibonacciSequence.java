import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Number of terms: ");
		int terms = sc.nextInt();
		System.out.print("Starting number: ");
		int start = sc.nextInt();
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		int [] A = new int [terms+1];

		A[0] = 0;
		A[1] = start;
		int count = 0;

		for (int i = 0; i<=number; i++) {
			for (int j = 2; j<A.length; j++) {
				A[j] = A[j-1]+A[j-2];
				A[2] = i;
					if (A[j]==number) {
						count = count+A[2];
						System.out.println(A[2]);
					}
			}
		}

		System.out.println("Total: "+count);
		
		

	}

}
