package collection;

public class IntList {
	private int[] nums;
	private int current;
	
	public IntList() { //생성자
		nums = new int[3];
		current = 0;
	}
	

	public void add(int num) {
		nums[current] = num;
		current++;
	}

	public void clear() {
//		for(int i=0;i<current;i++) //공간을 지우는것이 갯수를지우는게아니다.
//		nums[i] =0;
//		nums = new int[3];
		current = 0;
		
	}

	public int size() {
		
		return current;
	}

	public int get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}


}
