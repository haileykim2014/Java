package ch11;

import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		//기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장가능
		//컴파일러가 autoboxing에 의해 기본형이 참조형으로 자동변환
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
//		sub = list1.subList(1,4);
//		ArrayList list2 = new ArrayList(sub);
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1,list2);
		//collection은 인터페이스, collections는 클래스
		Collections.sort(list1);//list1과 list2를 정렬한다.
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		//list1이 list2의 모든요소를 포함하고있는지?
		list2.add("B");
		list2.add("c");
		list2.add(3,"A"); //[3]에 A추가 
		print(list1,list2);
		
		list1.add(0,"1"); //문자열'0'추가
		//indexof()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index="+list1.indexOf("1"));
//		list1.remove(0); // 인덱스[0]에있는게없어짐
		list1.remove(new Integer(1));
		
		
		list2.set(3, "AA");
		print(list1,list2);
	}
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
