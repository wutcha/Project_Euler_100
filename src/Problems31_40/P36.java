package Problems31_40;

public class P36 {

	public static void main(String[] args) {
		long sum = 0;
		for(int i = 1; i<1000000;i++) {
			StringBuilder s = new StringBuilder(Integer.toString(i));
			StringBuilder bin = new StringBuilder(Integer.toBinaryString(i));
			if(s.toString().equals(s.reverse().toString()) && bin.toString().equals(bin.reverse().toString()) && s.charAt(0)!='0' && bin.charAt(0)!='0') {
				sum+=i;
				System.out.println(s + " " + bin);
			}
		}
		System.out.println(sum);
	}

}
