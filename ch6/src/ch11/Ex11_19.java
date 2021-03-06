package ch11;

import java.util.*;
import static java.util.Collections.*;

public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5);
		System.out.println(list);
		
		rotate(list,2);// 오른쪽으로 두칸씩 이동
		System.out.println(list);
		
		swap(list,0,2);//첫번쨰와 세번쨰를 교환
		System.out.println(list);
		
		shuffle(list); //저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list,reverseOrder()); //역순정렬 reverse(list);와 동일
		System.out.println(list);
		
		sort(list); //정렬
		System.out.println(list);
	
		int idx = binarySearch(list,3); //3이 저장된 위치(index)를 반환
		System.out.println("index of 3 ="+idx);
	}

}
