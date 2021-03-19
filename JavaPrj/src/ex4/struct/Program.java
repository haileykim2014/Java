package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

   public static void main(String[] args) throws IOException {
      
      int count = 0;
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
      // Covid19를 로드하는 코드
      Covid19[] list = new Covid19[count];
      {
         FileInputStream fis = new FileInputStream("res/corona.csv");
         Scanner fscan = new Scanner(fis);
         
         String line;
         
         fscan.nextLine();
   
         for(int i=0; i<count; i++) {
            line = fscan.nextLine();
            String[] tokens = line.split(",");
            Covid19 covid = new Covid19(); //covid는 지역화된 변수라 }만나면 사라지고 반복되면서 다시생긴다

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
            
//            list[i] = covid.date; //covid.date는 String 자료형불일치            
         }
         

         
         fscan.close();
         fis.close();
      }
      //목록을 출력하는 코드
      {
    	  System.out.println(list[0].selfIsolation);
      }
      //---------------------------------------------------------
      // 레코드를 출력하는 코드(1)
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
      // 레코드를 출력하는 코드(2)
      for(int i=0; i<count; i++) {
    	  Covid19 covid = list[i]; //변수를 만들어주면 
    	  
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
    	  //이 데이터가뭐냐 코로나다. 의미가 사라있는 코드집합.코드를 좀더이해하게한다.
      		}
   		}
               
      }
      


//		String[] row1 = new String[3];
//		row1[0] = "2020-10-01";
//		row1[2] = "30";
//		row1[1] = "30";
//		//인덱스순서주의,변환작업발생
//		
//		Covid19 row2 = new Covid19(); 
//		//반드시 new연산자를 통해서  heap에 공간마련
//		row2.deaths = 30;
//		row2.cases = 30;
//		row2.tests = 23;		
//		
//		Covid19[] list = new Covid19[10]; 
//		//배열생성, 참조변수만 10개만듦(이름표만),클래스명이랑동일해서 .찍으면자동인식
//		//--------------------------------------------------------
//		list[0] = new Covid19(); // 클래스연결,멤버변수들이 그룹핑되어 공간이생김.
//		list[0].date ="";		
//		list[0].deaths = 12;
//		
//		//--------------------------------------------------------
//		list[1] = new Covid19(); // 클래스연결
//		list[1].date ="";
//		list[1].deaths = 12;
//			
//		Covid19 row;
//		//--------------------------------------------------------
//		row = new Covid19(); //힙에공간만들어짐
//		row.date = "2020"; //row date에 날짜담기
//		row.deaths = 20;
//		
//		list[0] = row;
//		
//		row = new Covid19();
//		row.date = "2020";
//		row.deaths = 20;
//		
//		list[1] = row;		
