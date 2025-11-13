package Problems41_50;
import java.util.*;
public class P44 {
	//while min > 3n+1
	//D must be pentagonal
	public static void main(String[] args) {
		Set<Long> s = new HashSet<>();
		for(long n = 1; n<100000; n++) {
			s.add(n*(3*n-1)/2);
		}
		for(long n = 1; n < 10000; n++) {
			long nn = n*(3*n-1)/2;
			for(long j = n+1; j<10000; j++) {
				long jj = j*(3*j-1)/2;
				if(s.contains(jj+nn)&&s.contains(2*jj+nn)) {
					System.out.println(nn + " e");
				}
				System.out.println(jj);
			}
		}
	}
}
