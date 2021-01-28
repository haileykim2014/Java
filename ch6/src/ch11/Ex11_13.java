package ch11;

import java.util.*;

public class Ex11_13 {

	public static void main(String[] args) {
		//1부터 45까지의 정수를 6개골라서 set에 저장후 출력
//		Set set = new HashSet(); //정렬안됨
		Set set = new TreeSet();
		for(int i=0; set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);

	}

}
