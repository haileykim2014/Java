package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

   public static void main(String[] args) throws IOException {
      
      int count = 0;
      //---------------------------------------------------------
      // ���ڵ� ������ �˾Ƴ��� �ڵ�
      {
         FileInputStream fis = new FileInputStream("res/corona.csv");
         Scanner fscan = new Scanner(fis);
         
         // while �ݺ��� �ϸ鼭 count++ ������ �Ѵ�. ������ ���� ���� ������
         while(fscan.hasNextLine()) {
            fscan.nextLine();
            count++;
         }
         
         fscan.close();
         fis.close();
         
         count--;
      }
      //--------------------------------------------------------
      // Covid19�� �ε��ϴ� �ڵ�
      Covid19[] list = new Covid19[count];
      {
         FileInputStream fis = new FileInputStream("res/corona.csv");
         Scanner fscan = new Scanner(fis);
         
         String line;
         
         fscan.nextLine();
   
         for(int i=0; i<count; i++) {
            line = fscan.nextLine();
            String[] tokens = line.split(",");
            Covid19 covid = new Covid19(); //covid�� ����ȭ�� ������ }������ ������� �ݺ��Ǹ鼭 �ٽû����

            covid.date = tokens[0];
            covid.cases = Integer.parseInt(tokens[1]); //int = String
            covid.deaths = Integer.parseInt(tokens[2]);
            covid.tests = Integer.parseInt(tokens[3]);
            covid.selfIsolation = Integer.parseInt(tokens[4]);
            covid.release = Integer.parseInt(tokens[5]);
            covid.recover = Integer.parseInt(tokens[6]);
            covid.selfQuarantineDomestic = Integer.parseInt(tokens[7]);
            covid.selfQuarantineImported = Integer.parseInt(tokens[8]);
            covid.pubDate = tokens[9];
            
            list[i] = covid;        
            
//            list[i] = covid.date; //covid.date�� String �ڷ�������ġ            
         }
         

         
         fscan.close();
         fis.close();
      }
      //����� ����ϴ� �ڵ�
      {
    	  System.out.println(list[0].selfIsolation);
      }
      //---------------------------------------------------------
      // ���ڵ带 ����ϴ� �ڵ�(1)
      for(int j=0; j<count; j++) {
            System.out.printf("%s ,", list[j].date);
            System.out.printf("%s ,", list[j].cases);
            System.out.printf("%s ,", list[j].deaths);
            System.out.printf("%s ,", list[j].tests);
            System.out.printf("%s ,", list[j].selfIsolation);
            System.out.printf("%s ,", list[j].release);
            System.out.printf("%s ,", list[j].recover);
            System.out.printf("%s ,", list[j].selfQuarantineDomestic);
            System.out.printf("%s ,", list[j].selfQuarantineImported);
            System.out.printf("%s ", list[j].pubDate);            
            
            if(j < count-1)
            	System.out.println();  
      		}         
      
      //---------------------------------------------------------
      // ���ڵ带 ����ϴ� �ڵ�(2)
      for(int i=0; i<count; i++) {
    	  Covid19 covid = list[i]; //������ ������ָ� 
    	  
    	  System.out.printf("%s, %d, %d, %d, %d, %d, %d, %d, %d, %d, %s\n",
    			  covid.date,
    			  covid.cases,
    			  covid.deaths,
    			  covid.tests,
    			  covid.selfIsolation,
    			  covid.release,
    			  covid.recover,
    			  covid.selfQuarantineDomestic,
    			  covid.selfQuarantineImported,
    			  covid.pubDate);
    	  //�� �����Ͱ����� �ڷγ���. �ǹ̰� ����ִ� �ڵ�����.�ڵ带 ���������ϰ��Ѵ�.
      		}
   		}
               
      }
      


//		String[] row1 = new String[3];
//		row1[0] = "2020-10-01";
//		row1[2] = "30";
//		row1[1] = "30";
//		//�ε�����������,��ȯ�۾��߻�
//		
//		Covid19 row2 = new Covid19(); 
//		//�ݵ�� new�����ڸ� ���ؼ�  heap�� ��������
//		row2.deaths = 30;
//		row2.cases = 30;
//		row2.tests = 23;		
//		
//		Covid19[] list = new Covid19[10]; 
//		//�迭����, ���������� 10������(�̸�ǥ��),Ŭ�������̶������ؼ� .�������ڵ��ν�
//		//--------------------------------------------------------
//		list[0] = new Covid19(); // Ŭ��������,����������� �׷��εǾ� �����̻���.
//		list[0].date ="";		
//		list[0].deaths = 12;
//		
//		//--------------------------------------------------------
//		list[1] = new Covid19(); // Ŭ��������
//		list[1].date ="";
//		list[1].deaths = 12;
//			
//		Covid19 row;
//		//--------------------------------------------------------
//		row = new Covid19(); //���������������
//		row.date = "2020"; //row date�� ��¥���
//		row.deaths = 20;
//		
//		list[0] = row;
//		
//		row = new Covid19();
//		row.date = "2020";
//		row.deaths = 20;
//		
//		list[1] = row;		
