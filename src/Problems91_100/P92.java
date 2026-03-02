package Problems91_100;
public class P92 {
	static int[] a = new int[(int)1e7+1];
	public static void main(String[] args) {
		long ms = System.currentTimeMillis();
		a[1]=1;
		a[89]=89;
		int c = 0;
		for(int i = 1; i < (int)1e7; i++) {
			res(i);
			if(a[i]==89) c++;
		}
		System.out.println(c);
		System.out.println((System.currentTimeMillis()-ms));
	}
	static int res(int cur) {
		if(a[cur]!=0) return a[cur];
		int dsum = 0;
		int c = cur;
		while(c > 0) {
			dsum += (c%10)*(c%10);
			c/=10;
		}
		a[cur]=res(dsum);
		return a[cur];
	}

}
