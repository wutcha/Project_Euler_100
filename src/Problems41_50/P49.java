package Problems41_50;
import java.util.*;
public class P49 {

	public static void main(String[] args) {
		List<Integer> l = sieve();
		List<int[]> c = new ArrayList<>();
		for(int i = 0; i < l.size(); i++) {
			int[] d = new int[10];
			for(char ch: Integer.toString(l.get(i)).toCharArray()) d[ch-'0']++;
			c.add(d);
		}
		for(int i = 0; i < l.size()-2; i++) {
			int[] ii = c.get(i);
			//for(char c: Integer.toString(i).toCharArray()) di[i-]
			for(int j = i+1; j < l.size()-1; j++) {
				int[] jj = c.get(j);
				boolean b = false;
				for(int k = 0; k < 10; k++) {
					if(ii[k]!=jj[k]) b = true;
				}
				if(b) continue;
				for(int k = j+1; k < l.size(); k++) {
					int[] kk = c.get(k);
					for(int m = 0; m < 10; m++) {
						if(jj[m]!=kk[m]) b = true;
					}
					//if(l.get(i) == 1487) System.out.println(l.get(i) + " " + l.get(j) + " " + l.get(k));
					if(!b) {
						
						if(l.get(j)-l.get(i)==l.get(k)-l.get(j)) {
							System.out.println(l.get(i) + " " + l.get(j) + " " + l.get(k));
						}
						//break;
					}
					b = false;
				}
			}
		}
	}
	
	static List<Integer> sieve(){
		List<Integer> l = new ArrayList<>();
		boolean[] a = new boolean[10000];
		for(int i = 2; i < 10000; i++) {
			if(!a[i]) {
				
				if(i>=1000) l.add(i);
				for(int j = i; j < 10000; j+=i) a[j]=true;
			}
		}
		return l;
	}
}
