package array;

public class Ex5_1111 {

	public static void main(String[] args) {
		//           01234
		String str ="ABCDE";
		char ch = str.charAt(4);
		System.out.println(ch);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1,5); //1~4
		System.out.println(str2); //bcd
		System.out.println(str3);
	}

}
