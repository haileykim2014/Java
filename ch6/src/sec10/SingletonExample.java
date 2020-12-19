package sec10;

public class SingletonExample {

	public static void main(String[] args) {
	//	Singleton obj1 = new Singleton(); 
		//앞에서 private으로 막았기때문에 생성안됨
		
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton객체입니다");
		}else {
			System.out.println("다른 Singleton객체입니다");
		}
		
	}

}
