package Inheritance;

public class PTOCClass {

	public static void main(String[] args) {
		ParentCla obj=new ChildCla();
		obj.studentForm();
		String u=obj.studentName("Aadhya");
		System.out.println("Name of student:" +u);
		int v=obj.marksOfStudents();
		System.out.println("Marks of student:" +v);

	}

}
