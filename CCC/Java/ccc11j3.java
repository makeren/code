import java.util.Scanner;

public class ccc11j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		long count = 2;
		long t1 = sc.nextLong();
		long t2 = sc.nextLong();
		long t3 = 0;

		while (t1>=t2) {
			t3 = t1-t2;
			t1 = t2;
			t2 = t3;
			count++;
		}
		System.out.println(count);

	}

}
