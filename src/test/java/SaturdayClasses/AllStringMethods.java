package SaturdayClasses;

import java.util.stream.Stream;

public class AllStringMethods {

	public static void main(String[] args) {
		String x="My selenium skills brush up again";
		String s=x.concat(" with new updates");
		System.out.println("Concatenate string:"+s);
		boolean r=x.endsWith("again");
		System.out.println("Ending point:"+r);
		boolean t=x.contains("selenium");
		System.out.println("The contains selenium word or not:"+t);
		boolean u=x.startsWith("My");
		System.out.println("It starts  with My word or not:"+u);
		boolean v=x.isBlank();
		System.out.println(v);
		boolean w=x.isEmpty();
		System.out.println(w);
		int y=x.length();
		System.out.println(y);
		Stream<String> z=x.lines();
		System.out.println(z);
		String b=x.replace("skills", "new Syllabus");
		System.out.println(b);
		String c=x.replaceAll("My selenium skills brush up again", "Learning new skills");
		System.out.println(c);
		String d=x.toUpperCase();
		System.out.println(d);
		
		
	}

}
