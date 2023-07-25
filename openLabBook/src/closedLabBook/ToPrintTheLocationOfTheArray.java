package closedLabBook;
import java.util.Scanner;
public class ToPrintTheLocationOfTheArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]=new int[] {1,2,3,4,5};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Which number's location you want to know?");
	int b=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			System.out.println("The number which you are looking for is in "+i+" location");
		}
	}
}
}
