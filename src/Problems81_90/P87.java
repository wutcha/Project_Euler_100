package Problems81_90;
import java.util.*;
public class P87 {
	
	public static void main(String[] args) {
		List<Long> prime = new ArrayList<>();
		boolean[] visited = new boolean[50000000];
		for(int i = 2; i < visited.length;i ++) {
			if(!visited[i]) {
				prime.add((long)i);
				for(int j = i; j < visited.length; j+=i) {
					visited[j] = true;
				}
			}
		}
		System.out.println(prime.size());
		Set<Long> s = new HashSet<>();
		for(int i = 0; i < prime.size(); i++) {
			long v = prime.get(i);
			long sumF = v*v*v*v;
			if(sumF>=50000000) break;
			
			for(int j = 0; j < prime.size(); j++) {
				long v1 = prime.get(j);
				long sumT = v1*v1*v1;
				if(sumT+sumF>=50000000) break;
				for(int k = 0; k < prime.size(); k++) {
					long v2 = prime.get(k);
					long sumS = v2*v2;
					if(sumT+sumF+sumS>=50000000) break;
					s.add(sumT+sumF+sumS);
				}
			}
		}
		System.out.println(s.size());
	}
	
	
	
}
