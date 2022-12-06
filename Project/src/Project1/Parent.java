package Project1;

public class Parent extends Grand {
	public void name() {
		String s="sachin@#";
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}
	public void number() {
		int n=10;
		System.out.println(n);
		
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Parent obj= new Parent();
		obj.number();
		obj.name();
		obj.team();
	}
}
