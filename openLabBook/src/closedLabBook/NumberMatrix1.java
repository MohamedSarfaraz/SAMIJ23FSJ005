package closedLabBook;

public class NumberMatrix1 {
public static void main(String[] args) {
	int b=1;
	int a[][] = new int[3][4];
	System.out.println(a[0].length);
	for(int i=0;i<=a.length;i++) {
		for(int j=1;j<=a[0].length;j++) {
			System.out.print(b+" ");
			b++;
		}
		System.out.println();
	}
	
}
}
