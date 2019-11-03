import java.util.Scanner;
import java.util.Stack;

public class ccc14s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Stack<Integer> stk = new Stack();
		
		int t = sc.nextInt();
		
		for (int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int tcount = 0;
			int pc = 1;
			int [] stc = new int [n];
			for (int j = 0; j<n; j++) {
				stc[j] = sc.nextInt();
			}
			
			for (int j = stc.length-1; j>=0; j--) {
				stk.push(stc[j]);
				if (stk.peek()==pc) {
					pc++;
					tcount++;
					stk.pop();
				}
			}
			
			while (stk.empty()!=true && tcount<n*3) {
				tcount++;
				if (stk.peek()==pc) {
					pc++;
					stk.pop();
				} else {
					
				}
			}
			
			if (stk.empty()==true) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			

		}

	}

}
