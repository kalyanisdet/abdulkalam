package Inheritance;

public class ChildCla extends ParentCla{

	public int c;
	public static int b;
	public String d;
	public int f;
	public String branchStudentOf(String branch) {
		d=branch;
		return d;
	}
	
	public int total_Mrks() {
		int f=c+b;
		return f;
	}

}
