package sec07.exam04_array;

public class HankookTire extends Tire{
	public HankookTire(String location,int maxRotation){ //�Ű����� �ΰ��޾ƾ���
		super(location,maxRotation);
	}
	@Override //ctrl+space
	public boolean roll() {
		++accumulatedRotation;
			if(accumulatedRotation<maxRotation) { //��� Ÿ�̾�ȸ������
				System.out.println(location+"HankookTire����:"+(maxRotation-accumulatedRotation));
				return true;
			}else {
				System.out.println(location+"HankookTire��ũ");
				return false; //���̻� ȸ���Ұ���
			}

}
}