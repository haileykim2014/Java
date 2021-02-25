package ch9;

import java.util.*;

public class Ex55_1 {

	public static void main(String[] args) {
		int[] arr = {0,4,2,1,3}; //1차원배열
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D = {{11,12},{21,22}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D)); //2차원배열 출력
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr을 전체복사
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3));
	}

}
