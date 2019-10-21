import java.util.*;
public class ccc05j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.next();
			if (input.equals("X")) {
				break;
			}
			System.out.println(isMonkeyWord(input)? "YES":"NO");
			//			boolean isMonkey = true;
			//			while (true) {
			//				input.replace("ANA", "A");
			//				input.replace("BAS", "A");
			//				if (!input.contains("ANA") && !input.contains("BAS") && !input.equals("A")) {
			//					isMonkey = false;
			//					break;
			//				}
			//				if (input.equals("A")) {
			//					break;
			//				}
		}

	}

	public static boolean isMonkeyWord (String in) {
		if (isAWord(in)) return true;
		for (int i = 0; i<in.length(); i++) {
			if (in.charAt(i)=='N') {
				if (isAWord(in.substring(0, i)) && isMonkeyWord(in.substring(i+1)) ) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isAWord(String s) {
		if (s.length()==0) return false;
		if (s.length()==1) return s.equals("A");
		if (s.charAt(0)=='B' && s.charAt(s.length()-1)=='S' && isMonkeyWord(s.substring(1, s.length()-1))) return true;
		return false;	
	}
}