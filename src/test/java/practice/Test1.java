package practice;




public class Test1 {
	int x;
	int y;
	int z;
	String name;
	int result;
	

	

	public void setX(int a) {
		x=a;
	}
	public int getX() {
		return x;
	}
	public void setY(int b) {
		y=b;
	}

	public int getY() {
		return y;
	}

	public void setZ(int c) {
		z=c;
	}

	public int getZ() {
		return z;
	}

	public void setName(String d) {
		name=d;
	}

	public String getName() {
		return name;
	}

	

	public void setResult(int a, int b, int c) {
		result=a*b*c;
	}
	public int getResult() {
		return result;
	}

	
	

	public static void main(String[] args) 
	{

		Test1 obj=new Test1();
		obj.setX(8);
		obj.setY(4);
		obj.setZ(2);
		obj.setName("First Java program in eclipse");
		obj.setResult(1, 2, 4);
	System.out.println(obj.getX());
	System.out.println(obj.getY());
	System.out.println(obj.getZ());
	System.out.println(obj.getName());
	System.out.println(obj.getResult());
	
		






	}

}
