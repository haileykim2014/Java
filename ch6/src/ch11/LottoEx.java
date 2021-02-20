package ch11;

import java.util.*;

public class LottoEx {

	public static void main(String[] args) {
// 45개의 공을 만든다
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=45;i++) {
			numbers.add(i); // 1~45
		}
//		섞는다
		Collections.shuffle(numbers); //섞이는 메소드수행 
//		뽑는다
		int[] picked = new int[6];
		for(int i=0;i<6;i++) { //numbers 의 앞 6개 숫자를 가져옴
			picked[i] = numbers.get(i);
		}
//		결과출력
		System.out.printf("자동생성번호:%s",Arrays.toString(picked));

		

	}

}
