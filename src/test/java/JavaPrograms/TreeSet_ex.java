package JavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TreeSet_ex {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("Selenium");
		ts.add("Abhinitio");
		ts.add("Cpp");
		ts.add("tosca");
		ts.add("scalar");
		for(String t:ts) {
			System.out.println(t);
		}
			System.out.println("=============");
			HashMap<Integer, String> hm=new HashMap<Integer, String>();
			hm.put(1, "java");
			hm.put(2, "Selenium");
			hm.put(3, "Testing");
			for(Entry<Integer, String> entry:hm.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			}
		}

	}


