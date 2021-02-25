package ch9;

public class Ex5_111 {

	public static void main(String[] args) {
		//            01234
		String str = "ABCDE"; //str.length()는 5
		char ch = str.charAt(2); //인덱스2의 문자열 : C
		String str2 = str.substring(1,4); // BCD
		String str3 = str.substring(1); // BCDE
		String str4 = str.substring(1,str.length()); // BCDE
		System.out.println(str4);
		
	}

}
