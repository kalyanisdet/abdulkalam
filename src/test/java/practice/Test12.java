package practice;

interface FlipkartClass{
	//In interface class we have to give statements for methods
	//For this statements, We have to create concrete class for interface class, & provide method bodies in concrete class for the statements(Interface class)
	public void add();
	public void multi();
	public String employeeDetailsList(int p, String q, String r);	
	
}
//Concrete class
//We have to provide method bodies here.
class AmazonClass{
	int a=2;
	int b=3;
	int result;
	String Name;
	String FirstName;
	int rollno;
	public void add() {
		result= a+b;
		System.out.println("The addition of 2 numbers:"+result);
	}
	public void multi() {
		result=a*b;
		System.out.println("The multiplication of 2 numbers:"+result);
	}
	public String employeeDetailsList(int p, String q, String r) {
		FirstName=q;
		rollno= p;
		Name=r;
		
		return "Name is:"+Name+"Roll no is:"+rollno+"FirstName is: "+FirstName;
	}
	
}




public class Test12 {

	public static void main(String[] args) {
		AmazonClass obj=new AmazonClass();
		obj.add();
		obj.multi();
	String s=obj.employeeDetailsList(20, "Venkateshwara", "T");
		System.out.println(s);

	}

}
