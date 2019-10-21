import java.util.*;
public class ccc15j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String happy = in.replace(":-)", "");
		String sad = in.replace(":-(", "");
		
		if (happy.length()>sad.length()) {
			System.out.println("sad");
		} else if (happy.length()<sad.length()) {
			System.out.println("happy");
		} else if (!happy.equals(in) && happy.length()==sad.length()) {
			System.out.println("unsure");
		} else {
			System.out.println("none");
		}

	}

}
