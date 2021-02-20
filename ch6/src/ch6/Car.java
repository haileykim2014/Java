package ch6;

public class Car {
	int gas; //필드
	
	void setGas(int gas) { //매개변수
		this.gas=gas;  
		/*this. : 매개변수의 이름과 필드이름이 동일할경우 메소드내에서 우선순위는 매개변수에있다
		 * 객체자신이 가지고있는 데이터를 사용
		 */
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다(gas잔량:"+gas+")");
				gas-=1;// 또는 gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량"+gas+")");
				return;
			}
		}
	}
}
