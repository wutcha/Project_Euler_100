package Problems51_60;
import java.math.*;
public class P57 {
	static BigInteger z = new BigInteger("0");
	static BigInteger GCD(BigInteger a, BigInteger b) {
		if(b.equals(z)) return a;
		return GCD(b,a.mod(b));
	}
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		
		BigInteger[] prev = new BigInteger[] {new BigInteger("3"),new BigInteger("2")};
		int c = 0;
		
		for(int i = 1; i < 1000; i++) {
			BigInteger denom = prev[0].add(prev[1]);
			BigInteger num = denom.add(prev[1]);
			//if(i<100)System.out.println(denom + " " + num);
		
			BigInteger GCD = GCD(num,denom);
			denom=denom.divide(GCD);
			num=num.divide(GCD);
			
			if(denom.toString().length()<num.toString().length()) c++;
			prev[0] = num;
			prev[1] = denom;
		}
		System.out.println(c);
		System.out.println(System.currentTimeMillis()-time + " ms");
	}

}
