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
		System.out.println();
		
		String skill = list.get(2);//인덱스2위치에있는것 가져와
		System.out.println(skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		list.remove(2); //2번인덱스객체가 삭제되고 3번이 2번으로 4번이3번으로 당겨짐
		list.remove("iBATIS");//문자삭제
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		
	}

}
