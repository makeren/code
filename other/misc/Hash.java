import java.util.*;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("hi", 1);
//		map.put("no u", 69);
//		map.put("hey", 420);
//		if (map.containsKey("hey")) {
//			System.out.println(map.get("hey"));
//		}
		
		while (true) {
			String word = sc.next();
			if (word.equals("quit")) {
				break;
			}
			if (map.containsKey(word)) {
				int v = map.get(word);
				map.put(word, v+1);
			} else {
				map.put(word, 1);
			}
		}
		
//		for (String e: map.keySet()) {
//			System.out.println(e+" "+map.get(e));
//		}
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
