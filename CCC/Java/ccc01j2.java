import java.util.Scanner;

public class ccc01j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte x = sc.nextByte();
		byte m = sc.nextByte();
		byte n = 0;
		
		for (byte i = 0; i<m; i++) {
			if ((x*i)%m==1) {
				n = i;
				System.out.println(n);
				break;
			}
		}
		
		if (n<1) {
			System.out.println("No such integer exists.");
		}

	}

}
