package inheritence;

public class RunnerClass {
	public static void main() {

	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent);
		
		Child1 child1 = new Child1();
		System.out.println(child1);
		
		Child2 child2 = new Child2();
		System.out.println(child2);
		
		Parent childParent1 = new Child1();
		System.out.println(childParent1);
		
		Parent childParent2 = new Child2();
		System.out.println(childParent2);	
	}
	

}
