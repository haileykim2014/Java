package ch11;

import java.util.*;

public class Ex11_9 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
		for(int i=0;set.size()<6;i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(new Integer(num));
//			set.add(num); //위과 같음
		}
//		System.out.println(set);// 출력하면 정렬되어 나오지않는다. set은 정렬불가 - list로 옮기고 list를 정렬해준다.
		List list = new LinkedList(set); //LinkedList(Collection c) 1.set의 모든요소를 list에 저장
		Collections.sort(list); // Collections.sort(List list) 2.list 정렬
		System.out.println(list); //3.list출력
	}

}
