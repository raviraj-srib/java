package inheritence;

public class Child2 extends Parent {

	{
		names.add("Child-2 Data");
	}
	
	@Override
	public String toString() {
		return names.toString();
	}

}
