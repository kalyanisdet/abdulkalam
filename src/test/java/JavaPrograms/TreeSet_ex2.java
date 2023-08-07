package JavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TreeSet_ex2 {

	public static void main(String[] args) {
		HashMap<Integer, String> ts=new HashMap<Integer, String>();
		ts.put(1, "Magnitia");
		ts.put(2, "Mindq");
		ts.put(3, "Orbit");
		ts.put(4, "Value Labs");
		ts.replace(2, "Magn");
		ts.replace(1, "Abdul");
		ts.replace(2, "Magn", "M1");
		
		for(Entry<Integer, String> entry:ts.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}

	}

