package DailyPractice;

public abstract class MyFirst {
	public int x;
	public static int y=9;
	public static final int z=10;
	public final int a=80;
	
	public MyFirst() {
		y=10;
		x=70;
	}
	public void method1() {
		x=20;
	}
	
	public int method2() {
		return a;
		
	}
	public static void method3() {
		int x;
	}
	
	public abstract void method4();

}
