
public class Ex4_7 {

	public static void main(String[] args) {

		//��ȣ {}���� ������ 20�� �ݺ��Ѵ�.
		// 1~10������ ������ 20�� ����Ͻÿ�.
		for(int i=1;i<=20;i++) {
//			System.out.println(Math.random()); //0.0<=x<1.0
//			System.out.println(Math.random()*10);//0.0<=10.0
//			System.out.println((int)(Math.random()*10));//0<=x<10 0~9
//			System.out.println((int)(Math.random()*10)+1);//1<=x<11 , 1~10
			
			
			// -5~5������ ������ 20�� ����Ͻÿ�. -5,-4,-3,-2,-1,0,1,2,3,4,5 = 11��
			
//			System.out.println(Math.random()); // 0.0<=x<1.0
//			System.out.println(Math.random()*10);// 0.0<=x<10.0
//			System.out.println((int)(Math.random()*10)); // 0<=x<10, 0~9
			System.out.println((int)(Math.random()*11)); //0<=x<11 , 1~10
			System.out.println((int)(Math.random()*11)-5); //-5<=x<6 , -5~5
			
			
			
		}
		
		

	}

}
