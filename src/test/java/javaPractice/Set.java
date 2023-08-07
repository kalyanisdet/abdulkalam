package javaPractice;

import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		Set<String> s=new TreeSet<String>();
		s.add("Java");
		s.add("Testing");
		s.add("Tosca");
		
		for(String str:s) {
			System.out.println(str);
		}
		System.out.println("============");
Iterator<String> itr=s.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
