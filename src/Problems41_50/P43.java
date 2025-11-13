package Problems41_50;
import java.util.*;
public class P43 {
	static long v;
	static long sum;
	static Set<Integer> s;
	public static void main(String[] args) {
		v = 0;
		sum = 0;
		s = new HashSet<>();
		dfs(10);
		System.out.println(sum);
	}
	static void dfs(int n) {
		if(n==0) {
			String cur = Long.toString(v);
			if(Integer.parseInt(cur.substring(1,4))%2!=0) return;
			if(Integer.parseInt(cur.substring(2,5))%3!=0) return;
			if(Integer.parseInt(cur.substring(3,6))%5!=0) return;
			if(Integer.parseInt(cur.substring(4,7))%7!=0) return;
			if(Integer.parseInt(cur.substring(5,8))%11!=0) return;
			if(Integer.parseInt(cur.substring(6,9))%13!=0) return;
			if(Integer.parseInt(cur.substring(7,10))%17!=0) return;
			sum+=v;
			return;
		}
		for(int i = 0; i <= 9; i++) {
			if(!s.contains(i)) {
				if(n==10&&i==0) continue;
				s.add(i);
				v=v*10+i;
				dfs(n-1);
				v/=10;
				s.remove(i);
			}
		}
	}
}
