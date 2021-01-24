import java.util.*;

public class ArrayAsListEx {

	public static void main(String[] args) {
		List<String>list1 = Arrays.asList("홍길동","신용권","감자바");
		for(String name:list1) {
			System.out.println(name);
		}

	}

}
