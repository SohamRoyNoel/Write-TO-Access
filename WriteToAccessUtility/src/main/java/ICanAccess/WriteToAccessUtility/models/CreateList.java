package ICanAccess.WriteToAccessUtility.models;

import java.util.ArrayList;
import java.util.List;

public class CreateList {

	public static List<PojoClass> getList() {
		
		List<PojoClass> s = new ArrayList<PojoClass>();
		
		s.add(new PojoClass("A1", "B1", "C1", "D1"));
		s.add(new PojoClass("A2", "B2", "C2", "D2"));
		s.add(new PojoClass("A3", "B3", "C3", "D3"));
		s.add(new PojoClass("A4", "B4", "C4", "D4"));
			
		return s;
	}
	
}
