import java.util.Scanner;

public class seed3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int I = sc.nextInt();
		int N = sc.nextInt();
		int J = sc.nextInt();
		int i;
		int j;
		String X;
		int xi;
		int xf;
		int k;
		int [] A = new int [I+1];
		int [] D = new int [A.length];
		int [] P = new int [A.length+1];
		String [] xyk = new String [3];
		int count = 0;
		
		sc.nextLine();
		for (i = 0; i<J; i++) {
			X = sc.nextLine();
			xyk = X.split(" ");
				xi = Integer.parseInt(xyk[0]);
				xf = Integer.parseInt(xyk[1]);
				k = Integer.parseInt(xyk[2]);
				
				D[xi] = D[xi]+k;
				D[xf+1] = D[xf+1]-k;
				
				for (j = 0; j<D.length; j++) {
					P[i+1] = P[i]+D[i]; 
				}
		}

		
		for (i = 0; i<D.length; i++) {
			P[i+1] = P[i]+D[i]; 
		}
		
		for (i = 2; i<P.length; i++) {
			if (P[i] < N) {
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
