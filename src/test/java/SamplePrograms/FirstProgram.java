package SamplePrograms;
//Inheritance
 class FirstOne{
	int a=10;
	int b=2;
	int c;
	String name;
	
	public void methOne() {
		c=a+b;
		System.out.println("Addition of 2 numbers:"+c);
	}
	
	public void methTwo() {
		c=a*b;
		System.out.println("Multiplication of 2 numbers:"+c);
	}
	
	public void methThree() {
		c=a/b;
		System.out.println("Division of 2 numbers:"+c);
	}
 }
	 class SecondOne extends FirstOne{
		int x=2;
		int y=4;
		int z;
		String nm;
		public void methFour() {
			z=x-y;
			System.out.println("Substraction of 2 numbers:"+z);
		}
		public void methFive() {
			z=x*y-2;
			System.out.println("Count is:"+z);
		}
		
	}


public class FirstProgram {

	public static void main(String[] args) {
		
		
		SecondOne obj=new SecondOne();
		obj.methOne();
		obj.methTwo();
		obj.methThree();
		obj.methFour();
		obj.methFive();
		
	}
}

