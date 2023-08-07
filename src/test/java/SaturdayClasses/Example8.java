package SaturdayClasses;

public class Example8 {

	public static void main(String[] args) {
		char ch='r';
		ch=Character.toLowerCase(ch);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("Not a vowel");

		}



	}

}
