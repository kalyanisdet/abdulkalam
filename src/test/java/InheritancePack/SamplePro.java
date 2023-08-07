package InheritancePack;


public class SamplePro {

	int java;
	int clang;
	int Python;
	String name;
	int Total_marks;
	
	public void Student_1(int a, int b) {
		java=a;
		clang=b;
		Total_marks=java+clang;
		System.out.println("Total marks in programming:"+Total_marks);
		
	}
	
	public void Student_2(int c, String d) {
		Python=c;
		name=d;
		System.out.println("Marks in Python:"+Python+"Name of Student2:"+name);
	}

}
