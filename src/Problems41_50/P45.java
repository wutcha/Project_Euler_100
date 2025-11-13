package Problems41_50;

public class P45 {
	public static void main(String[] args) {
		long b = 166;
		long c = 144;
		for(long a = 286; true; a++) {
			long aa = a*(a+1)/2;
			while(b*(3*b-1)/2<aa) b++;
			while(c*(2*c-1)<aa)c++;
			System.out.println(a + " " + b + " " + c);
			if(aa==b*(3*b-1)/2&&aa==c*(2*c-1)) {
				System.out.println(aa);
				break;
			}
		}
	}
}
