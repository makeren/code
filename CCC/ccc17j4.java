import java.util.*;
public class ccc17j4 {
	public static int time [] = new int [4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int D = sc.nextInt(), count = 0;
		boolean pattern = true;
		
		time[0] = 1; time[1] = 2;
		for (int i = 0; i<720; i++) {
			pattern = check();
			if(pattern) count++;
			change();
		}

		int times = D/720;
		count*=times;
		int over = D%720;
		time[0] = 1; time[1] = 2; time[2] = 0; time[3] = 0;

		while (over>0) {
			change();
			over--;
			//System.out.println(time[0]+""+time[1]+""+time[2]+""+time[3]);
			pattern = check();
			if(pattern) count++;
			
		}
		  
		System.out.println(count);

	}

	public static boolean check() {
		int dif = time[3]-time[2];
		if (time[0]==0) {
			if(time[2]-time[1]!=dif) return false;
		} else {
			for (int i = 2; i>0; i--) {
				int temp = time[i]-time[i-1];
				if (temp!=dif) return false;
			}
		}
		return true;
	}

	public static void change () {
		time[3]++;
		if (time[3]==10) {
			time[3] = 0;
			time[2]++;
		}
		if (time[2]==6) {
			time[2] = 0;
			time[1]++;
		}
		if (time[1]==10) {
			time[1] = 0;
			time[0]++;
		}
		if (time[0]==1 && time[1]==3) {
			time[0] = 0;
			time[1] = 1;
		}
	}

}


