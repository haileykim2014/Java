package ch6;

public class ArrayCreat {

public static void main(String[] args) {
	int[] scores;
	scores = new int[] {83,90,87};
	int sum1 = 0;
	for(int i=0;i<3;i++) {
		sum1+= scores[i];
	}
	System.out.println(sum1);
	
	int sum2 = add(new int[] {83,90,87});
	System.out.println(sum2);
}
//배열을 매개변수로 가지는 메소드를 호출할떄
public static int add(int[] scores) {
	int sum =0;
	for(int i=0;i<3;i++) {
		sum+=scores[i];
	}
	return sum;
}
}