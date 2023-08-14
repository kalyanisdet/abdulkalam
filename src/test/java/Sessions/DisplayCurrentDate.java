package Sessions;

import java.util.Date;

public class DisplayCurrentDate {

	public static void main(String[] args) {
		Date date=new Date();
		date.getDate();
		date.getDay();
		date.setTime(10);
System.out.println("Today date is:" +date.getDate()+"Day is:" +date.getDay());
	}

}
