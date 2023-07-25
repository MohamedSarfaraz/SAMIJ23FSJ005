package closedLabBook;
import java.util.Scanner;
public class AverageOfnNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x;
	float sum=0;
	System.out.println("how many numbers you want to enter:");
	x=scan.nextInt();
	for(int i=1; i<=x; i++) {
		System.out.println("Enter the number:");
		float y=scan.nextFloat();
	sum+=y;
	}
	float average = sum/x;
	
	System.out.println("Average = "+average);
	}
	
}

