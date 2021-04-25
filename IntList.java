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
		//������ ����ٰ� ������ ����°Ծƴϴ�.
		//nums = new int[3];
		current = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	public int get(int index) {
		if(current <= index)//���絥���Ͱ�3����� �ε�����0~2
			throw new IndexOutOfBoundsException();//����ó��
		return nums[index];
	}

}
