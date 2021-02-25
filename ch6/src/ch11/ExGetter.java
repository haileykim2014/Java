package ch11;

public class ExGetter {

	public static void main(String[] args) {
		//객체생성
		Knight k1 = new Knight("돈키호테",30);
		//생성결과 출력
		System.out.println("[객체생성]");
		System.out.printf("%s\n",k1.toString());
		//체력증가+30
		k1.setHp(50); //hp변경해야하는데 hp는 private이라서 다른클래스에서 접근불가->setter()를이용
		//결과출력
		System.out.println("[체력증가+30]");
		System.out.printf("%s\n",k1.toString());
	}

}

class Knight{
	//필드
	private String name;
	private int hp;
	
	//생성자
	public Knight(String name,int hp) {
		this.name = name; //필드초기화 
		this.hp =hp;
	}
	//세터
	public void setHp(int hp) {
		this.hp = hp;
	}
	//게터
//	public int getHp() {
//		return this.hp;
//	}
	//toString()
	public String toString() {
		return String.format("Knight{name:%s,hp:%d}", this.name,this.hp); //this.name은 인스턴스변수
	}
}

