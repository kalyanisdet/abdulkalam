package Interface;

public class Manager implements Employee{
	int x=5;
	int y=10;
	int z;
	String s="Grandhalaya";
	String r="VIOL";
	public void records() {
		z=x+y;
		System.out.println("Total records are:"+z);
	}
	public void labs() {
		z=y;
		System.out.println("Total labs are:"+z);
	}
	public void library() {
		System.out.println("Library name is:"+r);
	}
	public void dictionary() {
		System.out.println("Dictionary is:"+s);
	}
	
	}
	


