import java.util.*;
public class hkccc15j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		char a [] = new char [n];
		char b [] = new char [n];
		int aw = 0, bw = 0;
		
		for (int i = 0; i<n; i++) {
			String shape = sc.next();
			if (shape.equals("rock")) {
				a[i] = 'r';
			} else if (shape.equals("paper")) {
				a[i] = 'p';
			} else {
				a[i] = 's';
			}
		}
		
		for (int i = 0; i<n; i++) {
			String shape = sc.next();
			if (shape.equals("rock")) {
				b[i] = 'r';
			} else if (shape.equals("paper")) {
				b[i] = 'p';
			} else {
				b[i] = 's';
			}
		}
		
		for (int i = 0; i<n; i++) {
			if (a[i]=='r') {
				if (b[i]=='p') bw++;
				else if (b[i]=='s') aw++;
			} else if (a[i]=='p') {
				if (b[i]=='s') bw++;
				else if (b[i]=='r') aw++;
			} else if (a[i]=='s') {
				if (b[i]=='r') bw++;
				else if (b[i]=='p') aw++;
			}
		}
		
		System.out.println(aw+" "+bw);
		

	}

}
