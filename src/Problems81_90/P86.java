package Problems81_90;
public class P86 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n = 10000;
		int[] c = new int[n+1];
		c[100]=2060;
		for(int i = 101; i <= n; i++) {
			c[i] = c[i-1];
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= j; k++) {
					if(check(i,j,k)) {
						c[i]++;
						//System.out.println(i + " " + j + " " + k);
					}
				}
			}
			//System.out.println(s.size() + " " + i);
			if(c[i] > 1000000) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(System.currentTimeMillis()-start);
		
	}
	
	static boolean check(int i, int j, int k) {
		int ij = (i+j)*(i+j) + k*k;
		int jk = (k+j)*(k+j) + i*i;
		int ik = (i+k)*(i+k) + j*j;
		
		int sij = (int)Math.sqrt(ij);
		int sjk = (int)Math.sqrt(jk);
		int sik = (int)Math.sqrt(ik);
		
		if(sjk*sjk==jk) return true;
		return false;
	}

}
