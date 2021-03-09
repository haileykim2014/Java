package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/aaa.bmp"); // �̹������� �ҷ�����
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp"); // �̹����������

		// 2. fis�� ���ؼ� 1 ����Ʈ�� �о byte ���� b�� ��´�.
		// b�� ���� fos�� ���ؼ� ����Ѵ�.
		int size = 0;
		
		byte[] buf = new byte[1000];
		
		
		while ((size = fis.read(buf)) != -1)
			fos.write(buf);


		fis.close();
		fos.close();

		System.out.println("����Ϸ�");
		
		
	}
}
