package ch9;

import com.sun.jdi.*;

public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	public boolean equals(Object obj) { // 오버라이딩
		Value v = (Value)obj; // obj를 value로 형변환(다형성)
		//참조변수의 형변환전에는 반드시 instanceof로 확인해야함.
		if(!(obj instanceof Value)) return false;
		return this.value==v.value; //값이 같은지 ?
//		return this.value==obj.value; //주소비교.서로 다른객체는 항상거짓
	}
}
