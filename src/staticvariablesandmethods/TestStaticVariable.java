package staticvariablesandmethods;

public class TestStaticVariable {
	public static void main(String[] args) {
		Student s1 = new Student(111,"Suraj");
		Student s2 = new Student(222, "Prajit");
		Student s3 = new Student (333,"Roshan");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
