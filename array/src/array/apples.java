package array;
import java.util.Scanner;
public class apples {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("what's your name?");
		String name=input.nextLine();
		
		tunaObject.simpleMessage(name);
	}
} 