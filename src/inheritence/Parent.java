package inheritence;

import java.util.ArrayList;
import java.util.List;

public class Parent {
	List<String> names = new ArrayList<String>();
	
	{
		names.add("Parent Data");
		names.add("Other Parent Data");

	}
	
	@Override
	public String toString() {
		return names.toString();
	}

}
