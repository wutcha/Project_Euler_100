package Problems31_40;

import java.util.*;

public class P32 {

	public static void main(String[] args) {
		long sum = 0;
		for(int i = 1000; i <= 100000; i++) {
			for(int j = 2; j*j<i;j++) {
				if(i%j==0) {
					int fact = i/j;
					Set<Integer> s = new HashSet<>();
					int a = i;
					int b = j;
					int digits = 0;
					while(a>0) {
						s.add(a%10);
						a/=10;
						digits++;
					}
					while(b>0) {
						s.add(b%10);
						b/=10;
						digits++;
					}
					while(fact>0) {
						s.add(fact%10);
						fact/=10;
						digits++;
					}
					
					if(s.size()==9 && digits == 9 && !s.contains(0)) {
						sum+=i;
						System.out.println(i + " " + j + " " + i/j);
						break;
					}
				
				}
			}
		}
		System.out.println(sum);
	}

}
