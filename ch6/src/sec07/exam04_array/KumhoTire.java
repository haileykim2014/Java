package sec07.exam04_array;

public class KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation){ //매개값을 두개받아야함
		super(location,maxRotation);
	}
	@Override //ctrl+space
	public boolean roll() {
		++accumulatedRotation;
			if(accumulatedRotation<maxRotation) { //계속 타이어회전가능
				System.out.println(location+"KumhoTire수명:"+(maxRotation-accumulatedRotation));
				return true;
			}else {
				System.out.println(location+"KumhoTire펑크");
				return false; //더이상 회전불가능
			}

}
}