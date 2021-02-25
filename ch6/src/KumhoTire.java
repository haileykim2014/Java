
public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location,maxRotation);		
	}
	@Override //ctrl + space
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"KumhoTire수명"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire펑크");
			return false;
		}
	}
	

}
