package array;

import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}; //1차원배열 arr
		int[][] arr2D = {{11,12},{21,22}};//2차원배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		//문자열비교시 등가식 불가 
		//System.out.println(str2D==str2D2); 
		//위 식은 참조변수 값비교이다. 
		// 서로 다른 배열이기 때문에 같은 메모리상에 있지않다. 절대 겹칠수 없다(항상 false)
		
		System.out.println(Arrays.deepEquals(str2D,str2D2));
		
		int[] arr2 = Arrays.copyOf(arr,arr.length);
		/* 배열의 복사
		   배열arr을 복사해서 arr2를 만든다. arr.lenth만큼복사
		*/
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr,2,4); //
		System.out.println(Arrays.toString(arr3));
	}

}
