package ex5.fnc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray3 {
	
	static void printCovid19List(String[][] rows, int count) {
		System.out.println("// ���ڵ带 ����ϴ� �ڵ�------------------------");

		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%s", rows[j][i]);

				if (i < 10 - 1)
					System.out.printf(",");
			}
			System.out.println();
		} // ūfor����
	}// printCovid19List()��
	//--------------------------------------------------------
	static int getTotal(String[][] rows,int count) {
	  int total = 0;
	  
	  for(int i=0; i<count; i++)
	     total += Integer.parseInt(rows[i][3]);
	  
	  return total;
	}

   public static void main(String[] args) throws IOException {
      
      int count = 0;
      String[][] rows;
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
      
      // ���ڵ带 �ε��ϴ� �ڵ�
      {
         rows = new String[count][];
         FileInputStream fis = new FileInputStream("res/corona.csv");
         Scanner fscan = new Scanner(fis);
         
         String line;
         
         fscan.nextLine();
   
         for(int i=0; i<count; i++) {
            line = fscan.nextLine();
            rows[i] = line.split(",");
         }
         
         fscan.close();
         fis.close();
      }
      //---------------------------------------------------------      
      // ���ڵ带 ����ϴ� �ڵ�
      printCovid19List(rows, count); 

      //---------------------------------------------------------
      // �˻������� �������� ��� �ڵ�
      
      int total = getTotal(rows,count);
         System.out.println(total); 

       //f3������ �޼ҵ���̵�
      //---------------------------------------------------------
      
      // 1.�Ϻ� ���� ���� �˻��������? ���Դϲ�~
      // 2.����������� ���� ���Ҵ� ��¥��?
      {
         //1�� ������ ���� ����
         int max = 0;
         int current;
         
         //2�� ������ ���� ����
         String date = "";
         int idx = 0;
         
         for(int i=0; i<count; i++) {
            current = Integer.parseInt(rows[i][3]);
            if(current>max)
               max = current;
         }
         
         for(int i=0; i<count; i++)
            if(max == Integer.parseInt(rows[i][3])) {
               idx = i;
               break;
            }
                     
         System.out.println(max);
         System.out.println();
         
         System.out.printf("%s", rows[idx][0]);
         System.out.println();
      }   
         
      
      // Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
      {
         String date = "";
         int diff = 0;
         
         int old = 0; // ���� Ȯ���� ��
         int index = 0;
         for(int i=0; i<count; i++) {
            int current = Integer.parseInt(rows[i][1]);
            
            if(old != current) {
               
               diff = current - old;
               date = rows[i][0];
               
               old = current;
               System.out.printf("%d : %s, %d\n", index+++1, date, diff);
               
            }
         }
         
         /*
         2020-10-01,0
         2020-11-03,1
         2020-11-12,2
         2020-11-16,1
         2020-11-19,1
         ...
          */
      }
      
      // Ȯ���� ���� �þ ���ڿ� ���� ���� �迭�� ����ֽÿ�.
      String[][] results;   
      int resultCount = 0;
      
      {
         // Ȯ���� ���� �޶��� ������ resultCount�� ������Ŵ���ν� �����Ǵ� ���� ���� ���ϴ� �ڵ�
         int old = 0; // ���� Ȯ���� ��
                  
         for(int i=0; i<count; i++) {
            
            // i ��° ���� Ȯ���� ��
            int current = Integer.parseInt(rows[i][1]);
            
            // i ���� Ȯ����(current)�� ���� Ȯ���ڼ�(old)�� �ٸ��ٸ�
            if(old != current) {
               // Ȯ���� ���� �޶����� ������ ���� ����
               resultCount++;
               
               old = current;   
            }
         }
         
         System.out.println(resultCount);
         
         results = new String[resultCount][];
         
         String date = "";
         int diff = 0;
         
         old = 0; // ���� Ȯ���� ��
         
         int index = 0;
         for(int i=0; i<count; i++) {
            int current = Integer.parseInt(rows[i][1]);
            
            if(old != current) {               
               diff = current - old;
               date = rows[i][0];
               // �ڷγ�19 ������ ���� �����ϱ� ���� �迭
               String[] row = new String[2];
               row[0] = date;       // date
               row[1] = String.valueOf(diff);   // diff
               
               results[index++] = row;
               
               old = current;
            }
         }
         
         System.out.println("�۾��Ϸ�");
         
      }
      
      
      
   }

}


