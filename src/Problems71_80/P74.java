package Problems71_80;

import java.util.*;

public class P74 {
	static Map<Integer,Integer> s = new HashMap<>();
	static int[] factorial = new int[10];
	static int[] depth = new int[3000000];
	static int[] a = new int[3000000];
	
	public static void main(String[] args) {
		s.put(169,3);
		s.put(363601,3);
		s.put(1454,3);
		s.put(871,2);
		s.put(872,2);
		s.put(45361,2);
		s.put(45362,2);

		factorial[0] = 1;
		factorial[1] = 1;
		
		for(int i = 2; i < 10; i++) factorial[i] = factorial[i-1]*i;
		
		for(int i = 1; i <= 1000000; i++) {
			if(a[i]==0) dfs(i); 
		}
		for(int i = 1; i <= 1000000; i++) {
			System.out.println(depth[i] + " " + i );
		}
		Map<Integer,Integer> m = new TreeMap<>();
		for(int i: depth) m.put(i, m.getOrDefault(i,0)+1);
		for(int i: m.keySet()) System.out.println(i + " " + m.get(i));

	}
	static int dfs(int i) {
		if(s.containsKey(i)) {
			return s.get(i);
		}else if(a[i]!=0) {
			return depth[i];
		}
		a[i] = fact(i);
		depth[i] = 1 + dfs(a[i]);
		return depth[i];
	}
	static int fact(int i) {
		int ret = 0;
		int j = i;
		while(j>0) {
			ret+=factorial[j%10];
			j/=10;
		}
		return ret;
	}
	
}
