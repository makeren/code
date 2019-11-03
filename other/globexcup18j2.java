import java.util.*;
public class globexcup18j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int marks [] = new int [N];
		double mean = 0;
		for (int i = 0; i<N; i++) {
			marks[i] = sc.nextInt();
			mean+=marks[i];
		}
		mean/=N;
		int x = 0;
		
		for (int i = 0; i<N; i++) {
			if(mean<marks[i]) x++;
		}
		double d = N/2;
		if (x>d) System.out.println("Winnie should take the risk");
		else System.out.println("That's too risky");
		

	}

}
