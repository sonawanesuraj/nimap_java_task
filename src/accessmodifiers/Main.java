package accessmodifiers;

public class Main {
	public static void main(String[] args) {
		PrivateExample px = new PrivateExample();
	//	px.name="Hello";
		
		px.setName("Welcome");
		System.out.println(px.getName());
	}

}
