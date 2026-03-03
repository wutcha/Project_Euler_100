package Problems61_70;
import java.util.*;
public class P68 {
	static List<Integer> s = new ArrayList<>();
	static Set<Integer> h = new HashSet<>();
	static long ret = 0;
	public static void main(String[] args) {
		
		solve();
		System.out.println(ret);
	}
	static void solve() {
		if(s.size()==10) {
			calc();
			return;
		}
		for(int i = 1; i <= 10; i++) {
			if(!h.contains(i)) {
				s.add(i);
				h.add(i);
				solve();
				s.remove(s.size()-1);
				h.remove(i);
			}
		}
	}
	static void calc() {
		/*
		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		triplets:
		1, 2, 3
		4, 3, 5
		6, 5, 7
		8, 7, 9
		10, 9, 2
		
		external nodes: 1, 4, 6, 8, 10
		*/
		int s1 = s.get(0)+s.get(1)+s.get(2);
		int s2 = s.get(3)+s.get(2)+s.get(4);
		int s3 = s.get(5)+s.get(4)+s.get(6);
		int s4 = s.get(7)+s.get(6)+s.get(8);
		int s5 = s.get(9)+s.get(8)+s.get(1);
		
		if(s1==s2&&s2==s3&&s3==s4&&s4==s5) {
			StringBuilder ss = new StringBuilder();
			int min = Math.min(s.get(0), Math.min(s.get(3), Math.min(s.get(5), Math.min(s.get(7), s.get(9)))));
			int start = -1;
			if(min == s.get(0)) {
				start = 0;
			}else if(min == s.get(3)) {
				start = 1;
			}else if(min == s.get(5)) {
				start = 2;
			}else if(min == s.get(7)) {
				start = 3;
			}else {
				start = 4;
			}
			int c = 0;
			for(int i = start; true; i++) {
				if(i==0) {
					ss.append(s.get(0));
					ss.append(s.get(1));
					ss.append(s.get(2));
				}else if(i==1) {
					ss.append(s.get(3));
					ss.append(s.get(2));
					ss.append(s.get(4));
				}else if(i==2) {
					ss.append(s.get(5));
					ss.append(s.get(4));
					ss.append(s.get(6));
				}else if(i==3) {
					ss.append(s.get(7));
					ss.append(s.get(6));
					ss.append(s.get(8));
				}else {
					ss.append(s.get(9));
					ss.append(s.get(8));
					ss.append(s.get(1));
					i = -1;
				}
				c++;
				if(c==5) break;
				
			}
			System.out.println(ss);
			if(ss.length()==16) ret = Math.max(ret, Long.parseLong(ss.toString()));
			
		}
	}

}
