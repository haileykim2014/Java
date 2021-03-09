package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/aaa.bmp"); // 이미지파일 불러오기
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp"); // 이미지파일출력

		// 2. fis를 통해서 1 바이트를 읽어서 byte 변수 b에 담는다.
		// b의 값을 fos로 통해서 출력한다.
		int size = 0;
		
		byte[] buf = new byte[1000];
		
		
		while ((size = fis.read(buf)) != -1)
			fos.write(buf);


		fis.close();
		fos.close();

		System.out.println("복사완료");
		
		
	}
}
