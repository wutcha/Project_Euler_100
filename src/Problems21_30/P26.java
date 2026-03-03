package Problems21_30;
import java.util.*;
public class P26 {
	/*
	key insight that took me way too long to realize lol
	simulate long division
	if a remainder repeats, get the distance from the first time we saw it
	it cant be irrational so itll just repeat the sequence
	 */
	public static void main(String[] args) {
		int max = 0;
		int len = 0;
		for(int i = 2; i < 1000; i++) {
			if(len(i) > len) {
				max = i;
				len = len(i);
			}
		}
		System.out.println(max);
	}
	
	static int len(int d) {
		int cV = 1;
		while(cV < d) cV *= 10;
		List<Integer> dig = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		Set<Integer> rr = new HashSet<>();
		while(true) {
			int val = cV/d;
			cV = cV%d;
			if(rr.contains(cV)) break;
			dig.add(val);
			r.add(cV);
			rr.add(cV);
			if(cV==0) return 0;
			while(cV < d) {
				cV*=10;
				dig.add(0);
			}
		}
		while(r.get(0)!=cV) r.remove(0);
		return r.size();
	}

}
