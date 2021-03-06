package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		// 1.res/img.bmp ������ �б� ���� FileInputStream ��ü fis�� �����ϰ�
		//res/img_copy.bmp ���Ϸ� ���� ���� FileOutputStream ��ü fos�� �����Ѵ�.
		FileInputStream fis = new FileInputStream("res/aaa.bmp"); //�̹������� �ҷ�����
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp"); //�̹����������

		// 2. fis�� ���ؼ� 1 ����Ʈ�� �о byte ���� b�� ��´�.
		// b�� ���� fos�� ���ؼ� ����Ѵ�.
		int b = 0;
		while((b = fis.read()) != -1)
			fos.write(b);
		
		//3. 2���� �� �̻� �о���� ���� ���������� �ݺ�		
		fis.close();
		fos.close();
		
		System.out.println("����Ϸ�");		
	}
}
