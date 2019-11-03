import java.util.*;
public class dwite09c3p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] fib = new int [45];
		int count = 2;
		fib [0] = 1;
		fib [1] = 1;
		while (count<45) {
			fib[count] = fib[count-2]+fib[count-1];
			count++;
		}
		
		for (int i = 0; i<5; i++) {
			int n = sc.nextInt();
			int temp = 0;
			for (int j = 0; j<45; j++) {
				if (fib[j]>n) {
					if (Math.abs(fib[j]-n)>Math.abs(fib[j-1]-n)) {
						temp = fib[j-1];
					} else if (Math.abs(fib[j-1]-n)>Math.abs(fib[j]-n)) {
						temp = fib[j];
					} else {
						temp = fib[j];
					}
					break;
				}
			}
			System.out.println(temp);
		}

	}

}
