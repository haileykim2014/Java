package ex3.array.test2;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		

		
//		String n = new String("hello"); //StringŬ���� ��ü�������, ���ڸ� �����Ҽ��ִ� ��ɵ��������ִ�.
//		String n1 = "hello"; //��üȭ��, ���ڿ��� ����ִµ��� /
		
		
		String n1 = "ȫ�浿";
		String n2 = "ȫ�浿";

		
		String n3 = new String("ȫ�浿");
		String n4 = new String("ȫ�浿"); //��ä��
		
		System.out.println(n1 == n2); //�� new������
		System.out.println(n1.equals(n2)); //�� *���ֻ����
		System.out.println(n3 == n4); //����
		System.out.println(n3.equals(n4)); //��

		
//		
		String fileName = "photo.jpg";
		System.out.println(fileName.length()); // 9
		System.out.println(fileName.indexOf(".")); //"."�� ���ԵǾ�����? 5
		System.out.println(fileName.substring(3)); //to.jpg
		System.out.println(fileName.substring(3,2)); // ���� 
		System.out.println(fileName.substring(3,5)); // �ε���3~4���� to 
//		
		//���� ���ϸ��� .���ִ°������� ���ڿ��� ���(��.����)
		int a = fileName.indexOf(".");//��ġ�ľ�
		System.out.println(fileName.substring(0,a)); //-1�̻��̸� 0�����ִٴ°ɷ��ľ�.
		System.out.println(fileName.substring(a,8)); //-1�̻��̸� 0�����ִٴ°ɷ��ľ�.

		System.out.println(fileName.compareTo("aphoto.jpg")); // 15 > 0 ����ũ�ٸ� 
		System.out.println(fileName.compareTo("photo.jpg")); // ���ڿ� ������ 0�� ��ȯ
		System.out.println(fileName.compareTo("qphoto.jpg")); // -1
		System.out.println(fileName.compareTo("rphoto.jpg") > 0); // -2 0���������� ��ȣ
		//fileName �� ũ�� ���, fileName�� ��ȣ()���� ������ ����
		
	
		//"912"(���ڿ��� 1 2 ����д´�) "9" ���ڿ���ũ�� �ձ����� ��
		
		
		String[] names = new String[] {"��ȣ��","���缮","����","����ȣ","������","������","�ڹ���"};

		Random rand = new Random();
		
		for(int i=0; i<100;i++) {
			int idx1 = rand.nextInt(7); //0~6
			int idx2 = rand.nextInt(7); //0~6
//			System.out.printf("idx1 :%d, idx2:%d\n",idx1,idx2); //�������� Ȯ���Ѵ�.
						
			String temp; //���������̴޶����� �Ȱ���.
			temp = names[idx1]; //���������� �����ش�
			names[idx1] = names[idx2];
			names[idx2] = temp;			
		}
		
		for(int i=0;i<7;i++) {
			System.out.printf("%s",names[i]);
			if(i<7-1)
				System.out.print(",");		
		}		
		//����

						
		for(int j=0;j<6-1;j++) 		
			for(int i=0;i<7-1-j;i++) 
				if(names[i].compareTo(names[i+1]) > 0){
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					}			
				
			
	}
}



