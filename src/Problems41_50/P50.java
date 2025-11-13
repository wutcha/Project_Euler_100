package Problems41_50;

import java.util.*;

public class P50 {
	public static void main(String[] args) {
		List<Integer> s = sieve();
		int mL = 0;
		long p = 0;
		for(int i = 1; i < s.size(); i++) {
			int lo = 0;
			int hi = 0;
			int c = 0;
			long running = 0;
			while(hi <= i) {
				if(running == s.get(i)) {
					if(c>mL) {
						mL = c;
						p = s.get(i);
						//System.out.println(c + " " + p);
						break;
					}
					else {
						running-=s.get(lo);
						lo++;
						c--;
					}
				}else if(running < s.get(i)) {
					if(hi==i) break;
					running+=s.get(hi);
					hi++;
					c++;
				}else {
					running-=s.get(lo);
					lo++;
					c--;
				}
				
			}
		}
		System.out.println(p);

	}
	
	static List<Integer> sieve(){
		List<Integer> l = new ArrayList<>();
		boolean[] a = new boolean[1000000];
		for(int i = 2; i < 1000000; i++) {
			if(!a[i]) {
				l.add(i);
				for(int j = i; j < 1000000; j+=i) a[j]=true;
			}
		}
		return l;
	}

}
