package openLabBook;

public class CastingExercise {
	public static void main(String[] args) {
		byte b =10;
		int i = b; // will accept - automatic type promotion
		
		//byte c = i;/* won't accept because lower type cannot
		//be put in higher */
		
		byte d=(byte)i; // Type casting makes it possible to store compatible types
		
		byte x=20;
		byte y=20;
		
		//byte sum = x + y; /* Two bytes are used in a arithmetic
		//operation, the result will be in integer */
		
		
	}
}
