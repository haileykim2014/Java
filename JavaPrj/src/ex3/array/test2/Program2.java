package ex3.array.test2;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		

		
//		String n = new String("hello"); //String클래스 객체를만든것, 문자를 조작할수있는 기능들을갖고있다.
//		String n1 = "hello"; //객체화됨, 문자열을 담고있는도구 /
		
		
		String n1 = "홍길동";
		String n2 = "홍길동";

		
		String n3 = new String("홍길동");
		String n4 = new String("홍길동"); //객채비교
		
		System.out.println(n1 == n2); //참 new연산자
		System.out.println(n1.equals(n2)); //참 *자주사용함
		System.out.println(n3 == n4); //거짓
		System.out.println(n3.equals(n4)); //참

		
//		
		String fileName = "photo.jpg";
		System.out.println(fileName.length()); // 9
		System.out.println(fileName.indexOf(".")); //"."가 포함되었는지? 5
		System.out.println(fileName.substring(3)); //to.jpg
		System.out.println(fileName.substring(3,2)); // 에러 
		System.out.println(fileName.substring(3,5)); // 인덱스3~4까지 to 
//		
		//위의 파일명에서 .이있는곳까지의 문자열을 출력(단.제외)
		int a = fileName.indexOf(".");//위치파악
		System.out.println(fileName.substring(0,a)); //-1이상이면 0부터있다는걸로파악.
		System.out.println(fileName.substring(a,8)); //-1이상이면 0부터있다는걸로파악.

		System.out.println(fileName.compareTo("aphoto.jpg")); // 15 > 0 보다크다면 
		System.out.println(fileName.compareTo("photo.jpg")); // 문자열 같을때 0을 반환
		System.out.println(fileName.compareTo("qphoto.jpg")); // -1
		System.out.println(fileName.compareTo("rphoto.jpg") > 0); // -2 0보다작으면 괄호
		//fileName 이 크면 양수, fileName이 괄호()보다 작으면 음수
		
	
		//"912"(문자열은 1 2 라고읽는다) "9" 문자열의크기 앞글자의 비교
		
		
		String[] names = new String[] {"강호동","유재석","하하","김지호","김현준","김태희","박민정"};

		Random rand = new Random();
		
		for(int i=0; i<100;i++) {
			int idx1 = rand.nextInt(7); //0~6
			int idx2 = rand.nextInt(7); //0~6
//			System.out.printf("idx1 :%d, idx2:%d\n",idx1,idx2); //랜덤값을 확인한다.
						
			String temp; //데이터형이달라져도 똑같다.
			temp = names[idx1]; //랜덤값끼리 섞어준다
			names[idx1] = names[idx2];
			names[idx2] = temp;			
		}
		
		for(int i=0;i<7;i++) {
			System.out.printf("%s",names[i]);
			if(i<7-1)
				System.out.print(",");		
		}		
		//정렬

						
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



