package practice;



public class Test30 {

	public static void main(String[] args) {
		//To lower to upper case.
		String x="Programming is a easy to learning, if you have time.";
		String g="Programming is a easy to learning, if you have time.";
		String z="better";
		String y=x.toUpperCase();
		
		System.out.println(y);
			
		boolean f=x.matches(z);
		System.out.println(f);
		boolean h=g.equalsIgnoreCase(x);
		System.out.println(h);
		
		boolean j=x.contains("easy");
		System.out.println(j);
		
		
		}
	}


