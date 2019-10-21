import java.util.*;

public class ccc08j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//scan right to left
		// if not an operator, push onto stack
		// if an operator, pop the top two and add the operator
		// ^^ in a for loop (length of the array with all the values)
		// then print the top of the stack

		
		while (true) {
			String in = sc.nextLine();
			if (in.equals("0")) {
				break;
			}
			
			String [] eq = in.split(" ");
			
			Stack <String> s = new Stack <String> ();
			
			for (int i = eq.length-1; i>=0; i--) {
				if (eq[i].equals("+") || eq[i].equals("-")) {
					String s1 = s.pop();
					String s2 = s.pop();
					s.push(s1+" "+s2+" "+eq[i]);
				} else {
					s.push(eq[i]);
				}
			}
			
			System.out.println(s.pop());
		}

	}

}
