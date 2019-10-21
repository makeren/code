import java.util.Scanner;

public class ccc10j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i<=5;i++) {
			for(int j = i; j<=5;j++) {
				if(i+j==n) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
