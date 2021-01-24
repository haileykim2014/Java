package ch11;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		
		list.add("java");//인덱스0번째에 저장
		list.add("JBDC");
		list.add("Servlet"); //인덱스3으로밀려남
		list.add(2,"database"); //인덱스2에 저장
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: "+size);

	}

}
