package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) throws IOException {
	
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
		}System.out.println();
		//����

						
		for(int j=0;j<6-1;j++) 		
			for(int i=0;i<7-1-j;i++) 
				if(names[i].compareTo(names[i+1]) > 0){
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					}	
		for(int i=0;i<7;i++) {
			System.out.printf("%s",names[i]);
			if(i<6)
				System.out.print(",");
				
			}
}
}
