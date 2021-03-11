package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);

		String line = fscan.nextLine();
		
		String[] names = line.split(",");//쉼표기반으로 잘라줌
		
//		System.out.println(names[1].trim());	//문자열앞뒤빈공백없애줌
		
		String names1 = names[1].trim();
		
		System.out.println(names[1].trim());		
		
				
		fscan.close();
		fis.close();

	}
}



