import java.util.*;
public class ccc13j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int y = sc.nextInt();
		boolean unique = false;
		
		while (unique==false) {
			y++;
			String temp = y+"";
			boolean flag = true;
			
			for (int i = 0; i<temp.length(); i++) {
				for (int j = i+1; j<temp.length(); j++) {
					if (temp.charAt(i)==temp.charAt(j)) {
						flag = false;
					}
				}
			}
			
			if (flag == true) {
				unique = true;
			}
		}
		
		System.out.println(y);

	}

}
