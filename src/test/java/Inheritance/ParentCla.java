package Inheritance;

public class ParentCla {
	int a;
	static String name;
	final int b=100;
	static int c=120;
	int result;
	
	public void studentForm() {
		int z=a+b;
		System.out.println("Marks of subA & subB:" +z);
	}
	
	public static String studentName(String y) {
		name=y;
		
		return y;
	}
	public static final int marksOfStudents() {
		int c = 120;
		return c;
		
	}

}
