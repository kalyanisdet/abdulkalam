package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ex3 {

	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("Magnitia");
		s.add("Mindq");
		s.add("Selenium");
		s.add("Python");
		for(String str:s) {
			System.out.println(str);
		}
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

	}

