package array;

import java.util.*;

public class Ex4_15 {

	public static void main(String[] aregs) {
		int sum = 0;
		int i =0;
		
		while(true) { //���ѹݺ���
			if(sum>100) //sum �� 100�� ������ ��������.
				break;
			++i;
			sum+=i;
		
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
	}

}
