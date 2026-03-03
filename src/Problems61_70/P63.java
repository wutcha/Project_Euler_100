package Problems61_70;

public class P63 {

	public static void main(String[] args) {
		//counting?
		int count = 1; // 1^1
		count += 1; // 2^1
		count += 1; // 3^1
		count += 2; // 4^(1,2)
		count += 3; // 5^(1,2,3)
		count += 4; // 6^(1,2,3,4)
		count += 6; // 7^(1,2,3,4,5,6)
		count += 10; // 8^(1,2,3,4,5,6,7,8,9,10)
		count += 21; // 9^(1-21)
		System.out.println(count);
		
	}

}
