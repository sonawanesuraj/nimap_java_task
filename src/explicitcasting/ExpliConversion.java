package explicitcasting;

public class ExpliConversion {
	public static void main(String[] args) {
		double d = 200.5;
		int i=(int)d;
		System.out.println(i);
		long l = (long)d;
		System.out.println("long value : "+l);
		
		int m = (int)l;
		System.out.println("int value : "+i);
	}

}
