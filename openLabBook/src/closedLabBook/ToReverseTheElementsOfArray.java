package closedLabBook;

public class ToReverseTheElementsOfArray {
public static void main(String[] args) {
	int a[] = new int[] {67,33,22,54,98};
	System.out.println(a.length);
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}
