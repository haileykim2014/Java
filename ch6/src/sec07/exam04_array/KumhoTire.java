package sec07.exam04_array;

public class KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation){ //�Ű����� �ΰ��޾ƾ���
		super(location,maxRotation);
	}
	@Override //ctrl+space
	public boolean roll() {
		++accumulatedRotation;
			if(accumulatedRotation<maxRotation) { //��� Ÿ�̾�ȸ������
				System.out.println(location+"KumhoTire����:"+(maxRotation-accumulatedRotation));
				return true;
			}else {
				System.out.println(location+"KumhoTire��ũ");
				return false; //���̻� ȸ���Ұ���
			}

}
}