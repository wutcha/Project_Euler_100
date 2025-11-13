package Problems41_50;
import java.math.*;
public class P48 {
	public static void main(String[] args) { //come back to this lol
		BigInteger b = new BigInteger("1");
		for(int i = 2; i<=1000; i++) b = b.add(new BigInteger(Integer.toString(i)).pow(i));
		String s = b.toString();
		System.out.println(s.substring(s.length()-10));
	}
}
