package Problems31_40;
import java.util.*;
public class P35 {
	public static void main(String[] args) { //this ones kinda messy
		Set<Integer> s = sieve();
		Set<Integer> circular = new HashSet<>();
		for(int i: s) {
			String cur = Integer.toString(i);
			if(cur.length()==1) {
				circular.add(i);
				continue;
			}
			
			boolean add = true;
			for(int j = 0; j < cur.length(); j++) {
				if(!s.contains(Integer.parseInt(cur))) {
					add = false;
					break;
				}
				cur = cur.substring(1) + String.valueOf(cur.charAt(0));
				
			}
			if(add) circular.add(i);
			//System.out.println(i);
		}
		System.out.println(circular.size());
	}
	static Set<Integer> sieve(){
		Set<Integer> l = new HashSet<>();
		boolean[] arr = new boolean[1000000];
		for(int i = 2; i < 1000000; i++) {
			if(!arr[i]) {
				l.add(i);
				for(int j = i; j < 1000000; j+=i) {
					//if(i==2) System.out.println(j + " e");
					arr[j] = true;
				}
			}
		}
		return l;
	}
}

