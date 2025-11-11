package Problems31_40;
import java.util.*;
public class P33 {
	public static void main(String[] args) {
		
		List<int[]> l = new ArrayList<>();
		for(double i = 12; i<100; i++) {
			if(i%10==0) continue;
			for(double j = i+1; j < 100; j++) {
				if(j%10==0) continue;
				if(i%11==0&&j%11==0) continue;
				double frac = i/j;
				double frac2 = ((int)i/10)/(j%10);
				//if(i==49 && j==98) System.out.println(frac +" " +frac2);
				if(frac==frac2 && (i%10)==(int)j/10) {
					l.add(new int[] {(int)i,(int)j});
					System.out.println(i + " " + j);
				}
				
			}
		}
		int num = 1;
		int den = 1;
		for(int[] a: l) {
			num*=a[0];
			den*=a[1];
		}
		System.out.println(den/GCD(num,den));
	}
	static int GCD(int a, int b) {
		return (b == 0 ? a : GCD(b, a % b));
	}
}
