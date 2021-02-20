package ch11;

public class Ex6_27 {

		public static void mian(String args[]) {
			System.out.println("BlockTest bt = new BlockTest();");
			BlockTest bt = new BlockTest();
			
			System.out.println("BlockTest bt2 = enw BlockTest();");
			BlockTest bt2 = new BlockTest();
		}
		
		static {
			System.out.println("static{}");//클래스초기화블러
		}
		{
		System.out.println("{}"); //인스턴스초기화블럭
		}
		public Ex6_27() {
			System.out.println("생성자");
		}
	}




