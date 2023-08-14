package DailyPractice;

import java.util.HashMap;
import java.util.Map;

public class GetCombinationCls {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(10, "Om");
		map.put(20, "Sri");
		map.put(30, "Sai");
		map.put(40, "Namaha");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			int x=entry.getKey();
			String y=entry.getValue();
			System.out.println("The id's are : " +x+ "The names are : " +y);
		}

	}

}
