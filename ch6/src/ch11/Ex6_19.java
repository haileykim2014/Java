package ch11;

public class Ex6_19 {
	public static void change(String str) {
		str += "456"; //지역변수라서 change메소드가 끝나면 사라진다.
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+ str); //main메소드안에있는 str을 불러온다.

	}

}
