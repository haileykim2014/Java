package ex4.struct;

public class Program {

	public static void main(String[] args) {
		
		String[] row1 = new String[3];
		row1[0] = "2020-10-01";
		row1[2] = "30";
		row1[1] = "30";
		row1[3] = "23";
		//인덱스순서주의
		//변환작업발생
		
		Covid19 row2 = new Covid19(); 
		//반드시 new연산자를 통해서  heap에 공간마련
		row2.deaths = 30;
		row2.positive = 30;
		row2.tests = 23;
		
		
		Covid19[] list = new Covid19[10]; 
		//new연산자를썻지만, heap에 메모리생성안되고 스택에만올라가나?
		//배열생성, 참조만 10개,클래스명이랑동일해서 .찍으면자동인식
		//--------------------------------------------------------
//		list[0] = new Covid19(); // 클래스연결해줘야함. list
		list[0].date ="";
		list[0].deaths = 12;
		//--------------------------------------------------------
		list[1] = new Covid19(); // 클래스연결해줘야함.
		list[1].date ="";
		list[1].deaths = 12;
		
		
		Covid19 row;
		//--------------------------------------------------------
		row = new Covid19(); //힙에공간만들어짐
		row.date = "2020"; //row date에 날짜담기
		row.deaths = 20;
		
		list[0] = row;
		
		row = new Covid19();
		row.date = "2020";
		row.deaths = 20;
		
		list[1] = row;		

	}

}
