package Problems51_60;
import java.math.*;
public class P55 {

	public static void main(String[] args) {
		int c = 0;
		for(int i = 1; i < 10000; i++) {
			BigInteger cur = new BigInteger(Integer.toString(i));
			boolean b = false;
			for(int j = 0; j < 50; j++) {
				cur = cur.add(new BigInteger(rev(cur.toString())));
				if(p(cur)) {
					b = true;
					break;
				}
			}
			if(!b) {
				c++;
				if(i < 100) System.out.println(i + " " + cur + " " + rev(cur.toString()));
			}
		}
		System.out.println(c);
	}
	static String rev(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	static boolean p(BigInteger b) {
		if(b.toString().equals(rev(b.toString()))) return true;
		return false;
	}
}
