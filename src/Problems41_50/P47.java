package Problems41_50;
import java.util.*;
public class P47 {
	static Set<Integer> s = p();
	public static void main(String[] args) {
		
		int[] in = new int[1000000];
		for(int i = -3; i<= 999999; i++) {
			in[i+3] = c(i+3);
			if(i>=0) {
				//System.out.println(in[i] + " " + in[i-1] + " " + in[i-2] + " " + in[i-3]);
				if(in[i]==4&&in[i+1]==4&&in[i+2]==4&&in[i+3]==4) {
					System.out.println(i);
				}
			}
		}
		
		
	}
	static int c(int v) {
		int vv = v;
		Set<Integer> ss = new HashSet<>();
		for(int i = 2; i*i<=vv; i++) {
			while(vv%i==0) {
				ss.add(i);
				vv/=i;
			}
		}
		if(vv>1) ss.add(vv);
		return ss.size();
	}
	static Set<Integer> p(){
		Set<Integer> s = new HashSet<>();
		boolean[] b = new boolean[1000000];
		for(int i = 2; i<1000000;i++) {
			if(!b[i]) {
				s.add(i);
				for(int j = i; j<1000000;j+=i) b[j]=true;
			}
		}
		return s;
	}
	
}
