package ex5.fnc;

public class Program {

	static int power(int x) {
		return (x+3)*(x+3);
	}
	
	static int add(int x,int y) {
		return x+y; //return까지 실행한다.
	}
	static void print(int x) {
		System.out.println(x); 
		//반환하는게없다	
	}
	
	static void printSum(int x,int length) {
		int sum = 0;
		
		if(length <= 0) {
			System.out.println("length에 잘못된 값을 입력함");
			return ;
		}
		
		for(int i=0 ; i< length ; i++)//	
			sum += (x+i);
			
		for(int i=0 ; i< length ; i++) { //출력
			System.out.printf("%d",x+i);
			
			if(i<length-1)
				System.out.print("+");
			
		}
		System.out.print("=");
		System.out.printf("%d\n",sum);
	} //코딩패턴못잡음....
	


	public static void main(String[] args) {
		
		// power(x) = (x+3)*(x+3)+x;
		//add(x,y) = x+y
		int c = add(3,4);
		
		System.out.println(c);
		System.out.println(add(5,6));
		
		//print(x) = output : x
		print(30);
		
		//printSum(x,length) //x:2 ,length:3->2+3+4

		printSum(3,3);

	}

}
