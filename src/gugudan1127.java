
public class gugudan1127 {

	public static void main(String[] args) {

//매번 타이핑치면 비효율적, 반복문사용
		
		//6단
		int i =1;
		while(i<10) {
			System.out.println(6*i);
			i =i+1; //i++
		}
			//7단
			for(int j =1; j<10; j++) {
			System.out.println(7*j);}
			
			//8단
			for(int e=1; e<10; e++) {
			System.out.println(8*e);
		}
			//9단
			for(int f=1; f<10; f++) {
				System.out.println(9*f);
			}

			//2단
			//9단 (1부터 999까지 곱셈을 구하고싶다면
			for(int a=1; a<1000; a++) {
				System.out.println(9*a);
	}
	}
}
