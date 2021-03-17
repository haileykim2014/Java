package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program3MultiArray3 {

   public static void main(String[] args) throws IOException {
      
      int count = 0;
      String[][] rows;
      //---------------------------------------------------------
      // 레코드 개수를 알아내는 코드
      {
         FileInputStream fis = new FileInputStream("res/corona.csv");
         Scanner fscan = new Scanner(fis);
         
         // while 반복을 하면서 count++ 연산을 한다. 마지막 줄을 만날 때까지
         while(fscan.hasNextLine()) {
            fscan.nextLine();
            count++;
         }
         
         fscan.close();
         fis.close();
         
         count--;
      }
      //--------------------------------------------------------
      // 레코드를 로드하는 코드
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
      // 레코드를 출력하는 코드
      for(int j=0; j<count; j++) {
         for(int i=0; i<10; i++) {
            System.out.printf("%s", rows[j][i]);
            
            if(i < 10-1)
               System.out.printf(",");
         }
         
         System.out.println();
      }
      //---------------------------------------------------------
      // 검사진행자 누적수를 얻는 코드
      {
         int total = 0;
         
         for(int i=0; i<count; i++)
            total += Integer.parseInt(rows[i][3]);
         
         System.out.println("Total:"+total);
         System.out.println();
      }
      
      
      // 1.일별 가장 많은 검사진행수는? 몇입니꽈~
      // 2.감사진행수가 가장 많았던 날짜는?
      {
         //1번 문제를 위한 변수
         int max = 0;
         int current;
         
         //2번 문제를 위한 변수
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
         
      
      // 확진자 수가 늘어난 일자와 수를 출력하시오.
      {
         String date = "";
         int diff = 0;
         
         int old = 0; // 현재 확진자 수
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
      
      // 확진자 수가 늘어난 일자와 수를 다음 배열에 담아주시오.
      String[][] results;   
      int resultCount = 0;
      
      {
         // 확진자 수가 달라질 때마다 resultCount를 증가시킴으로써 증가되는 일자 수를 구하는 코드
         int old = 0; // 현재 확진자 수
                  
         for(int i=0; i<count; i++) {
            
            // i 번째 행의 확진자 수
            int current = Integer.parseInt(rows[i][1]);
            
            // i 번재 확진자(current)와 이전 확진자수(old)가 다르다면
            if(old != current) {
               // 확진자 수가 달라지는 일자의 수를 증가
               resultCount++;
               
               old = current;   
            }
         }
         
         System.out.println(resultCount);
         
         results = new String[resultCount][];
         //이름표: 4바이트, 주소는 4바이트=32비트         
         String date = "";
         int diff = 0;
         
         old = 0; // 위에서 쓰였으므로 초기화시키기
         
         int index = 0;
         for(int i=0; i<count; i++) { //데이터 총 행인 76까지반복
            int current = Integer.parseInt(rows[i][1]); //제주 확진자
            
            if(old != current) {//기존확진자와 현재확진자비교
               
               diff = current - old;//차이 = 현재확진자-기존확진자
               date = rows[i][0]; //차이발생한 날
               old = current; //기존확진자->현재확진자
               
               String[] row = new String[2];
               row[0] = date;       // date
               row[1] = String.valueOf(diff); // 정수->문자열변환
               
               results[index] = row; //index++후 출력하면 인덱스1이 증가되어 다음인덱스가출력됨
               
               System.out.println(Arrays.toString(results[index]));
               
               index++;//results배열인덱스 증가
            }
         }         

         System.out.println("작업완료");
                  
      }
      
      
      
   }

}



