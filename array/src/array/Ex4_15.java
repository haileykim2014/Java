package array;

import java.util.*;

public class Ex4_15 {

	public static void main(String[] aregs) {
		int sum = 0;
		int i =0;
		
		while(true) { //무한반복문
			if(sum>100) //sum 이 100을 넘으면 빠져나옴.
				break;
			++i;
			sum+=i;
		
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
	}

}
