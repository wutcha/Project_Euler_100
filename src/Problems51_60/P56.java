package Problems51_60;
import java.math.*;
public class P56 {

	public static void main(String[] args) {
		int max = 0;
		for(int i = 1; i < 100; i++) {
			for(int j = 1; j < 100; j++) {
				BigInteger b = new BigInteger(Integer.toString(i)).pow(j);
				String s = b.toString();
				int c = 0;
				for(char ch: s.toCharArray()) {
					c+=ch-'0';
				}
				max = Math.max(c, max);
			}
		}
		System.out.println(max);
	}

}
