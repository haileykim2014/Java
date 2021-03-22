package ex5.fnc;

public class Program {

	static int power(int x) {
		return (x+3)*(x+3);
	}
	
	static int add(int x,int y) {
		return x+y; //return���� �����Ѵ�.
	}
	static void print(int x) {
		System.out.println(x); 
		//��ȯ�ϴ°Ծ���	
	}
	
	static void printSum(int x,int length) {
		int sum = 0;
		
		if(length <= 0) {
			System.out.println("length�� �߸��� ���� �Է���");
			return ;
		}
		
		for(int i=0 ; i< length ; i++)//	
			sum += (x+i);
			
		for(int i=0 ; i< length ; i++) { //���
			System.out.printf("%d",x+i);
			
			if(i<length-1)
				System.out.print("+");
			
		}
		System.out.print("=");
		System.out.printf("%d\n",sum);
	} //�ڵ����ϸ�����....
	


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
