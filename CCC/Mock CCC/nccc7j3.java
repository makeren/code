import java.util.*;
public class nccc7j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		
		System.out.println(N%(K+1)+(N/(K+1)*K));
		
	}

}
