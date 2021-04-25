package com.newlecture.app.util;

public class IntList {
	
	private int[] nums;
	private int current;
	
	public IntList() {
		nums = new int[3];
		current = 0;
	}

	public void add(int num) {
		nums[current] = num;
		current++;
		//nums[current++] = num;		
	}

	public void clear() {
		//공간을 지운다고 갯수를 지우는게아니다.
		//nums = new int[3];
		current = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	public int get(int index) {
		if(current <= index)//현재데이터가3개라면 인덱스는0~2
			throw new IndexOutOfBoundsException();//예외처리
		return nums[index];
	}

}
