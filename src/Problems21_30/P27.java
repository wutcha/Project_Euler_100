package Problems21_30;
import java.util.*;
import java.io.*;
public class P27 {
	public static void main(String[] args) {
		Set<Integer> s = sieve();
		int max = 0;
		long prod = 0;
		for(int a = -999; a<1000; a++) {
			for(int b = -1000; b <= 1000; b++) {
				int c = 0;
				for(int n = 0; s.contains(n*n+a*n+b);n++) {
					c++;
				}
				
				if(c>max) {
					prod = a*b;
					max = c;
				}
			}
		}
		System.out.println(max);
		System.out.println(prod);
	}
	static Set<Integer> sieve(){
		Set<Integer> s = new HashSet<>();
		boolean[] arr = new boolean[10000000];
		for(int i = 2; i < arr.length; i++) {
			if(!arr[i]) {
				s.add(i);
				for(int j = i; j<arr.length;j+=i) arr[j]=true;
			}
		}
		return s;
	}
	
}
