package Problems31_40;

import java.util.*;

public class P38 {

	public static void main(String[] args) {
		Set<Integer> s = sieve();
		long sum = 0;
		
		for(int i: s) {
			if(i<=10) continue;
			int c = i;
			boolean b = true;
			long lo = 1;
			for(int j = 1; j < Integer.toString(i).length(); j++) lo*=10;
			while(c>10) {
				if(!s.contains(c)) {
					b = false;
					break;
				}
				c%=lo;
				lo/=10;
			}
			b &= s.contains(c);
			c=i;
			while(c>10) {
				if(!s.contains(c)) {
					b = false;
					break;
				}
				c/=10;
			}
			if(b && s.contains(c)) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	static Set<Integer> sieve(){
		Set<Integer> l = new HashSet<>();
		boolean[] arr = new boolean[10000000];
		for(int i = 2; i < 10000000; i++) {
			if(!arr[i]) {
				l.add(i);
				for(int j = i; j < 10000000; j+=i) {
					arr[j] = true;
				}
			}
		}
		return l;
	}

}
