package Problems91_100;
import java.math.*;
public class P97 {
	public static void main(String[] args) {
		long l = 28433;
		long mod = 10_000_000_000L;
		for(int i = 0; i < 7830457; i++) {
			l*=2;
			l%=mod;
		}
		l++;
		System.out.println(l);
	}
}
