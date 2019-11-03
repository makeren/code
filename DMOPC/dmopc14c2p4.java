import java.util.*;
public class dmopc14c2p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int treePSA [] = new int [n+1];
		
		treePSA[0] = 0;
		for (int i = 1; i<=n; i++) {
			treePSA[i] = treePSA[i-1]+sc.nextInt();
		}
		
		int queries = sc.nextInt();
		
		for (int i = 0; i<queries; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(treePSA[b+1]-treePSA[a]);
		}

	}

}
