package ex6.캡슐화.로또.객체지향.생성자;

import java.util.Random;

//재사용
public class Lotto {
	private int[] nums; // Lotto의 청사진,단순 정의,
	private int size;

	public int getNum(int i) {
		int num = nums[i];
		return num;
	}
	//초기화는 단 한번만 실행되길 바란다.
	//초기화는 속성이 사용되기 전에만 실행되길 바란다.
	//다른어떤 로직보다 가장 먼저 실행되길 바란다.
	//위의 두 조건을 만족하는 도구 => Constructor(생성자)
	public Lotto() {
		size = 6;
		nums = new int[size];
	}

	public int getSize() {//가져오는것
		return size;
	}

//	public void setSize(int i) {//값을 셋팅
//		this.size =size;		
//	}
	

	public void gen() {
//		Lotto lotto = new Lotto(); // 4바이트
//		lotto.nums = new int[6]; // 배열의 공간생성
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}

	}// gen()끝

	public void sort() {
		
		for (int j = 0; j < size - 1; j++) {
			for (int i = 0; i < size - 1 - j; i++) {
				int compare;
				if (nums[i] > nums[i + 1]) {
					compare = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = compare;
				}
			}
		}
	}// sort()끝

}
