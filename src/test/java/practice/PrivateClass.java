package practice;

public class PrivateClass {
	//Private properties are accessible within the class only.
	//Not outside of the class.
private String name;

public static void main(String[] args) {
	PrivateClass obj=new PrivateClass();
	obj.name="Om";
}
}
