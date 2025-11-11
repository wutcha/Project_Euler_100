package Problems31_40;

public class P34 {

	public static void main(String[] args) {
		long[] fact = new long[10];
		fact[0] = 1;
		for(int i = 1; i <= 9; i++) {
			fact[i] = fact[i-1]*i;
		}
		long s = 0;
		for(long i = 3; i<=(long)1e8;i++) {
			long sum = 0;
			long num = i;
			while(num>0) {
				sum+=fact[(int)num%10];
				num/=10;
			}
			if(sum==i) s+=i;
		}
		System.out.println(s);
	}

}
