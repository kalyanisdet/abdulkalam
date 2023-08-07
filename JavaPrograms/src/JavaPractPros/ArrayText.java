package JavaPractPros;

public class ArrayText {

	public static void main(String[] args) {
		String str="Trying to learn for main concepts";
		String x[]=str.split("");
		for(String y:x) {
			System.out.println(y);
		}
		/*
		 * String s="28-Mar-2023"; System.out.println(s.split("-")[2]);
		 */
		
		String r="This fish is good to eat";
		String t[]=r.split("");
		for(String z:t) {
			if(z.contains("is")){
				System.out.println(z);
			}
			
		}
		String g="$45.90";
		System.out.println(g.substring(1).split("\\.")[0]);
		//To get 2nd value of the string when we give //(backward slash).
		//Should important index here.
		String h="$100.80";
		String j=h.substring(2).split("\\.")[1];
		System.out.println(j);
		
		}
	
	
		

	}


