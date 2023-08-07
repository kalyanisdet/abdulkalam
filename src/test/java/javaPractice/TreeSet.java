package javaPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class TreeSet {

	public static void main(String[] args) {
		/*TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("Selenium");
		ts.add("Cpp");
		ts.add("C");
		
		for(String s:ts) {
			System.out.println(s);
		*/	
	HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
	hashMap.put(1, "Java");
	hashMap.put(2, "Selenium");
	hashMap.put(3, "Testing");
	hashMap.put(4, "Python");
	for(Entry<Integer, String> entry:hashMap.entrySet()) {
		System.out.println(entry.getKey()+ " " +entry.getValue());
	}
		}

	}


