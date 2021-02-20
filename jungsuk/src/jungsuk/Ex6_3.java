package jungsuk;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("2ÀÇ 5½Â:"+powerOfTwo(5));

	}
	public static int powerOfTwo(int n) {
		if(n==0)
			return 1;
		
		  return 2 * powerOfTwo(n - 1);
	}
}
