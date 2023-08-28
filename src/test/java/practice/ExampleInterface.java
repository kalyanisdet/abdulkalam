package practice;

 interface PractiseOne{
	 public static final int result = 0;
	
	public int meths(int a, int b);
	public int meths1(int a, int b);
	public String meths2(String name);
	
 

 public class PractiseTwo implements PractiseOne{
	 
	 public int meths(int a, int b) {
		  int result=a+b;
		  return result;
	 }
	 public int meths1(int a, int b) {
		 int result=a*b;
		 return result;
	 }
	 public String meths2(String name) {
		 String result=name;
		return result;
	 }
 }

 }

public class ExampleInterface {

	public static void main(String[] args) {
		practice.PractiseOne.PractiseTwo obj=new practice.PractiseOne.PractiseTwo();
		int d=obj.meths(3, 2);
int e= obj.meths1(6,2);
String f=obj.meths2("Dinesh");

System.out.println("add 2 numbers:" +d);
System.out.println("Multiply 2 numbers:" +e);
System.out.println("Name:" +f);
	}

}
