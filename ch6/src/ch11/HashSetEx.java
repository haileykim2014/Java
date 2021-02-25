package ch11;

import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java"); // 이미 동일한 문자가 첫번째에 저장되어있음.한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수: "+set.size());
	}

}
