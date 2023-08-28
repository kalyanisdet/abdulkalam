package practice;

public class ClassC {

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		int s=obj.methA(5,6);
		int  t=obj.methB(6,9);
System.out.println("Muliplication of method a: "+s);
System.out.println("Adding numbers of method b:"+t);
	}

}
