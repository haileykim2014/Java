package array;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
	
		String[] strArr= {"����","����","��"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
			int tmp=(int)(Math.random()*3);
		System.out.println(strArr[tmp]);
	}
	}
}
