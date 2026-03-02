package Problems51_60;
public class P58 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		boolean[] prime = new boolean[1000000000];
		prime[0] = true;
		prime[1] = true;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i*2; j < prime.length; j+=i) prime[j] = true;
			}
		}
		
		int p = 0;
		int count = 1;
		for(int i = 3; i < 100000; i+=2) {
			count+=i-1;
			if(!prime[count]) p++;
			count+=i-1;
			if(!prime[count]) p++;
			count+=i-1;
			if(!prime[count]) p++;
			count+=i-1;
			if(!prime[count]) p++;
			if(10*p<(i/2)*4+1) {
				System.out.println(i);
				break;
			}

			System.out.println(p + " " + i);
		}
		System.out.println(System.currentTimeMillis()-time);
		
		
	}
	
}
