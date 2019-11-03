import java.util.*;
public class War {
	// a problem: uh. stack overflow. not sure... what to do about that. usually happens around 1900s, but i've seen it at 1700s and 2000s
	// it has to do with the number of wars that happen-- the 2000 game likely had very few wars
	// the average game is hard to find. most games go from 100-300 and 1400-2000
	static Random rand = new Random(); 
	static String [] cards = new String [52];
	static Stack <String> d1 = new Stack<String>();
	static Queue <String> wp1 = new LinkedList<String>();
	static Stack <String> d2 = new Stack<String>();
	static Queue <String> wp2 = new LinkedList<String>();
	static Queue <String> tws = new LinkedList<String>();
	static String p1;
	static String p2;
	static int rounds = 1;
	static int wars = 0;

	static void newDeck() {
		int count = 0;
		for (int i = 0; i<4; i++) {
			String c = "";
			//setting suits; spades beat diamonds beat hearts beat clubs
			if (i==0) {
				c = "s";
			} else if (i==1) {
				c = "d";
			} else if (i==2) {
				c = "h";
			} else if (i==3) {
				c = "c";
			}
			for (int j = 1; j<=13; j++) {
				cards[count] = c+j;
				count++;
			}
		}
	}

	static void shuffle() {
		for (int i = 0; i<104; i++) {
			int n = rand.nextInt(52);
			int m = rand.nextInt(52);
			String temp = cards[n];
			cards[n] = cards[m];
			cards[m] = temp;
		}
	}

	static void deal() {
		for (int i = 0; i<52; i+=2) {
			d1.push(cards[i]);
		}
		for (int i = 1; i<52; i+=2) {
			d2.push(cards[i]);
		}
	}

	static String cardNaming(String c) {
		String cp = "";

		if (c.substring(1).equals("1")) {
			cp = "ace of ";
		} else if (c.substring(1).equals("11")) {
			cp = "jack of ";
		} else if (c.substring(1).equals("12")) {
			cp = "queen of ";
		} else if (c.substring(1).equals("13")) {
			cp = "king of ";
		} else {
			cp = c.substring(1)+" of ";
		}

		if (c.charAt(0)=='s') {
			cp+="spades";
		} else if (c.charAt(0)=='d') {
			cp+="diamonds";
		} else if (c.charAt(0)=='h') {
			cp+="hearts";
		} else if (c.charAt(0)=='c') {
			cp+="clubs";
		}

		return(cp);

	}

	static void play() {
		boolean cont = true;
		String c1 = d1.pop();
		String c2 = d2.pop();
		String p1p = cardNaming(c1);
		String p2p = cardNaming(c2);
		int c1n = Integer.parseInt(c1.substring(1));
		int c2n = Integer.parseInt(c2.substring(1));

		System.out.println("\n-------"+rounds+" Battles-------"+wars+" Wars-------\n");

		System.out.println(p1+" plays the "+p1p+"!");
		System.out.println(p2+" plays the "+p2p+"!");

		if (c1n>c2n) {
			System.out.println("The "+p1p+" is higher than the "+p2p+"! "+p1+" gets the cards.");
			wp1.offer(c1);
			wp1.offer(c2);
		} else if (c2n>c1n) {
			wp2.offer(c1);
			wp2.offer(c2);
			System.out.println("The "+p2p+" is higher than the "+p1p+"! "+p2+" gets the cards.");
		} else {
			tws.offer(c1);
			tws.offer(c2);
			cont = war();
		}
		
		boolean cie = checkIfEmpty();

		if (true==cont && cie==true) {
			System.out.println("\n Cards in Hand:");
			System.out.println(p1+": "+d1.size());
			System.out.println(p2+": "+d2.size());
			System.out.println("\n Cards in Win Pile:");
			System.out.println(p1+": "+wp1.size());
			System.out.println(p2+": "+wp2.size());
			System.out.println("\n Total Cards Owned:");
			System.out.println(p1+": "+(d1.size()+wp1.size()));
			System.out.println(p2+": "+(d2.size()+wp2.size()));
			rounds++;
			play();
		}
	}

	static boolean war () {
		wars++;
		boolean cont = true;
		if (d1.size()<2) {
			System.out.println("\n"+p1+" does not have enough cards in hand for war. The win pile will be transferred.");
			while (!wp1.isEmpty()) {
				d1.push(wp1.poll());
			}
			if (d1.size()<2) {
				System.out.println("\nThe win pile is empty! "+p1+" cannot participate in war!");
				System.out.println("\n"+p2+" wins the game in "+rounds+" rounds!");
				cont = false;
				return false;
			}
		}

		if (d2.size()<2) {
			System.out.println("\n"+p2+" does not have enough cards in hand for war. The win pile will be transferred.");
			while (!wp2.isEmpty()) {
				d2.push(wp2.poll());
			}
			if (d2.size()<2) {
				System.out.println("\nThe win pile is empty! "+p2+" cannot participate in war!");
				System.out.println("\n"+p1+" wins the game in "+rounds+" rounds!");
				cont = false;
				return false;
			}
		}

		if (cont==true) {
			String w1 = d1.pop();
			String w2 = d1.pop();
			String w3 = d2.pop();
			String w4 = d2.pop();
			tws.offer(w1);
			tws.offer(w2);
			tws.offer(w3);
			tws.offer(w4);
			int w1v = Integer.parseInt(w2.substring(1)); 
			int w2v = Integer.parseInt(w4.substring(1)); 
			System.out.println("\n"+"The values are tied! It's time for war! Two cards will be taken out of each player's deck-- the second will decide your fate!\n");
			String w1n = cardNaming(w2);
			String w2n = cardNaming(w4);
			System.out.println(p1+" reveals "+w1n+"!");
			System.out.println(p2+" reveals "+w2n+"!");

			if (w1v>w2v) {
				System.out.println("The "+w1n+" is higher than the "+w2n+"! "+p1+" gets the cards.");
				while (!tws.isEmpty()) {
					wp1.offer(tws.poll());
				}

			} else if (w2v>w1v) {
				System.out.println("The "+w2n+" is higher than the "+w1n+"! "+p2+" gets the cards.");
				while (!tws.isEmpty()) {
					wp2.offer(tws.poll());
				}

			} else {
				war();
			}
			return true;
		}
		return false;
	}

	static boolean checkIfEmpty() {
		if (d1.empty()) {
			System.out.println("\n"+p1+" has no cards left in their hand. The win pile will be transferred.");
			if (!wp1.isEmpty()) {
				while (!wp1.isEmpty()) {
					d1.push(wp1.poll());
				}
			} else {
				System.out.println(p1+" has no cards in the win pile!");
				System.out.println("\n"+p2+" wins the game in "+rounds+" rounds!");
			}

		}

		if (d2.empty()) {
			System.out.println("\n"+p2+" has no cards left in their hand. The win pile will be transferred.");
			if (!wp2.isEmpty()) {
				while (!wp2.isEmpty()) {
					d2.push(wp2.poll());
				}
			} else {
				System.out.println(p2+" has no cards in the win pile!");
				System.out.println("\n"+p1+" wins the game in "+rounds+" rounds!");
			}
		}

		if (d1.empty() || d2.empty()) {
			return false;
		} else {
			return true;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("Player 1: ");
		p1 = sc.nextLine();

		System.out.println("Player 2: ");
		p2 = sc.nextLine();

		newDeck();
		shuffle();
		deal();
		play();

		System.out.println("\n\n-------END OF GAME-------");
		System.out.println("Total "+rounds+" battles, "+wars+" wars.");

	}

}
